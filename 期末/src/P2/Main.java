package P2;
import java.util.*;


public class Main {
        public static void main(String args[]) {
            List<Student> list = new ArrayList<Student>();
            list.add(new Student("2016001","rose",18));
            list.add(new Student("2016002","hunifu",19));
            list.add(new Student("2016003","britsh",20));
            Iterator<Student> it = list.iterator();
                    ; //����������
            while (it.hasNext()
            ) { //�жϱ����Ƿ����
                Student stu=it.next();
                        ;//ȡ�б�Ԫ��
                System.out.println(stu);
            }
        }
 }

