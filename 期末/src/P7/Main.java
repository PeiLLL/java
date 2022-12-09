package P7;

import java.util.ArrayList;
import java.util.Collection;

import java.util.Iterator;
import java.util.Scanner;

/**
 * 主要
 *
 * @author llq
 * @date 2022/11/28
 */
public class Main {
    public static void main(String[] args) {
        // 1、创建有序集合对象
        Collection<Employee> c = new ArrayList<>();

        // 创建3个员工元素对象
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            String employeeName = sc.nextLine();
            int employeeAge = sc.nextInt();

            Employee employee = new Employee(employeeName, employeeAge);
            c.add(employee);
        }


        // 2、创建迭代器遍历集合
        Iterator<Employee> it = c.iterator();

        //3、遍历
        while (it.hasNext()) {

            //4、集合中对象未知，向下转型
            Employee e = (Employee) it.next();

            System.out.println(e.getName() + "---" + e.getAge());
        }
    }
}