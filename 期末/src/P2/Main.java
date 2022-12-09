package P2;
import java.util.*;


public class Main {
        public static void main(String args[]) {
            List<Student> list = new ArrayList<Student>();
            list.add(new Student("2016001","rose",18));
            list.add(new Student("2016002","hunifu",19));
            list.add(new Student("2016003","britsh",20));
            Iterator<Student> it = list.iterator();
                    ; //创建迭代器
            while (it.hasNext()
            ) { //判断遍历是否结束
                Student stu=it.next();
                        ;//取列表元素
                System.out.println(stu);
            }
        }
 }

