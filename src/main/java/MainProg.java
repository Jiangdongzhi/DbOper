import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import entity.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import util.HashSort;
import util.QuickSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/**
 * Created by dorianns on 15/4/6.
 */
public class MainProg {
    public static void testSpring() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");

        Dorian dorian = (Dorian) ctx.getBean("dorian");

        dorian.sayHi("Doris");
    }

    public static void testBinary() {
        int intNum = 1000;
        int operand = 500;

        int intResult = intNum << 1;
        int bitXorResult = intNum ^ operand;
        System.out.println("New integer number is:" + intResult);
        System.out.println("bitXorResult is:" + bitXorResult);
    }

    public static void testOptional() {
        Double input = null;
        Optional<Double> testNum = Optional.of(input);

        System.out.println(testNum.get());
    }

    public static void testArray() {
        List<Integer> list = new ArrayList<Integer>();

        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(11));
        list.add(Integer.valueOf(21));
        list.add(Integer.valueOf(15));
        list.add(Integer.valueOf(61));

        int size = list.size();
        System.out.println("List size is: " + size);
        int temp = size >> 1;
        System.out.println("List element at: " + temp + " is " + list.get(temp - 1));

    }

    public static void testSort() {
        System.out.println("Start to sort");

        QuickSort sortUtil = new QuickSort();

        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee e1 = new Employee(); e1.setAge(20); e1.setName("Doris"); e1.setSalary(80000.00);
        Employee e2 = new Employee(); e2.setAge(30); e2.setName("Dorian"); e2.setSalary(10000.10);
        Employee e3 = new Employee(); e3.setAge(25); e3.setName("Dorianne"); e3.setSalary(34100.10);
        Employee e4 = new Employee(); e4.setAge(27); e4.setName("DoriA"); e4.setSalary(10432.00);
        Employee e5 = new Employee(); e5.setAge(38); e5.setName("DoriC"); e5.setSalary(13484.10);
        Employee e6 = new Employee(); e6.setAge(15); e6.setName("DoriD"); e6.setSalary(18043.10);
        Employee e7 = new Employee(); e7.setAge(23); e7.setName("DoriE"); e7.setSalary(10245.00);
        Employee e8 = new Employee(); e8.setAge(34); e8.setName("DoriF"); e8.setSalary(18342.10);
        Employee e9 = new Employee(); e9.setAge(18); e9.setName("DoriG"); e9.setSalary(18230.10);
        Employee ea = new Employee(); ea.setAge(26); ea.setName("DoriH"); ea.setSalary(14302.00);
        Employee eb = new Employee(); eb.setAge(33); eb.setName("DoriI"); eb.setSalary(23418.10);
        Employee ec = new Employee(); ec.setAge(19); ec.setName("DoriJ"); ec.setSalary(43180.10);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);
        employees.add(e9);
        employees.add(ea);
        employees.add(eb);
        employees.add(ec);
        List<Employee> outItems = sortUtil.sort(employees);
        int i = 0;
        for (Employee emp : outItems) {
            System.out.println((++i) + ": " + emp.getName() + " who ages " + emp.getAge());
        }
    }

    /* 15,30,25,27,38,20
       15 20 25 27 38 30
     */

    public static void main(String[] args) {
        try {
            testOptional();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            testSpring();
            testBinary();
            testArray();
            testSort();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
