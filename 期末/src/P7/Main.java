package P7;

import java.util.ArrayList;
import java.util.Collection;

import java.util.Iterator;
import java.util.Scanner;

/**
 * ��Ҫ
 *
 * @author llq
 * @date 2022/11/28
 */
public class Main {
    public static void main(String[] args) {
        // 1���������򼯺϶���
        Collection<Employee> c = new ArrayList<>();

        // ����3��Ա��Ԫ�ض���
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            String employeeName = sc.nextLine();
            int employeeAge = sc.nextInt();

            Employee employee = new Employee(employeeName, employeeAge);
            c.add(employee);
        }


        // 2��������������������
        Iterator<Employee> it = c.iterator();

        //3������
        while (it.hasNext()) {

            //4�������ж���δ֪������ת��
            Employee e = (Employee) it.next();

            System.out.println(e.getName() + "---" + e.getAge());
        }
    }
}