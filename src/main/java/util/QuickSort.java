package util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dorianns on 15/5/9.
 */
public class QuickSort implements Sort {
    public <T extends Comparable<T>> List<T> sort(List<T> list) {
        return quickSort(list, 0, list.size() - 1);
    }

    private <T extends Comparable<T>> List<T> quickSort(List<T> list, int start, int end) {
        int head = start;
        int tail = end;
        T temp = list.get(tail);
        System.out.println(start + " vs " + end);
        while (head < tail) {
            while (head < tail && compare((Comparable) list.get(head), (Comparable) temp)) {
                head ++;
            }
            if (head < tail) {list.set(tail, list.get(head)); tail --;}
            while (head < tail && compare((Comparable) temp, (Comparable) list.get(tail))) {
                tail --;
            }
            if (head < tail) {list.set(head, list.get(tail)); head ++;}
        }
        list.set(head, temp);
        if (start < head - 1) {quickSort(list, start, head - 1);}
        if (tail + 1 < end) {quickSort(list, tail + 1, end);}
        return list;
    }

    private boolean compare(Comparable e1, Comparable e2) {
        return e1.compareTo(e2) <= 0;
    }
}
