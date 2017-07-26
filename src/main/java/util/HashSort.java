package util;

import entity.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dorianns on 15/5/4.
 */
public class HashSort implements Sort {
    public <T extends Comparable<T>> List<T> sort(List<T> list) {
        List<Comparable> tempList = new ArrayList<Comparable>();
        for (T elem : list) {
            tempList.add((Comparable) elem);
        }
        List<T> result = new ArrayList<T>();
        while (tempList.size() > 1) {
            MaxifyHeap(tempList);
            result.add((T) tempList.get(0));
            Comparable elem = tempList.get(tempList.size() - 1);
            tempList.set(0, elem);
            tempList.remove(tempList.size() - 1);
        }
        result.add((T) tempList.get(0));
        return result;
    }

    private void MaxifyHeap(List<Comparable> list) {
        for (int i = list.size() >> 1; i >= 1; i --) {
            int left = i << 1;
            int right = (i << 1) + 1;
            System.out.println("comparing " + i + " with " + left + " and " + right);
            if (right <= list.size()) {
                int exchange = Maximum(list, i, left, right);
                System.out.println("Current exchange is:" + exchange);
                if (exchange != i) {
                    Comparable temp = list.get(exchange - 1);
                    list.set(exchange - 1, list.get(i - 1));
                    list.set(i - 1, temp);
                }
            } else if (left <= list.size()) {
                int exchange = Maximum(list, i, left, left);
                System.out.println("Current exchange is:" + exchange);
                if (exchange != i) {
                    Comparable temp = list.get(exchange - 1);
                    list.set(exchange - 1, list.get(i - 1));
                    list.set(i - 1, temp);
                }

            }
        }
        Employee e1 = (Employee) list.get(0);
        System.out.println(e1.getName());
    }

    private int Maximum(List<Comparable> list, int i, int j, int k) {
        Comparable mid = list.get(i - 1);
        Comparable left = list.get(j - 1);
        Comparable right = list.get(k - 1);
        System.out.println("Mid: " + ((Employee) mid).getAge());
        System.out.println("Left: " + ((Employee) left).getAge());
        System.out.println("Right: " + ((Employee) right).getAge());
        int outIndex = i;

        if (mid.compareTo(left) < 0) {
            outIndex = j;
            mid = left;
        }
        if (mid.compareTo(right) < 0) {
            outIndex = k;
        }

        return outIndex;
    }
}
