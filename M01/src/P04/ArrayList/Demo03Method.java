package P04.ArrayList;

import java.util.ArrayList;

/*
8
ArrayList�еĳ��÷�����
1��public boolean add(E e);�򼯺������Ԫ�أ����������ͺͷ���һֱ
2��public E get(int index);�Ӽ��ϵ��л�ȡԪ�أ�������������ţ�����ֵ�Ƕ�Ӧλ�õ�Ԫ��
3��public E remove(int index);�Ӽ��ϵ���ɾ��Ԫ�أ�������������š�����ֵ���Ǳ�ɾ����Ԫ��
4��public int size();��ȡ���ϵĳߴ糤�ȣ�����ֵ���Ǽ����а�����Ԫ�ظ���
 */
public class Demo03Method {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        boolean success = list.add("�ֿ���");
        System.out.println(list);
        System.out.println("��ӵĲ����Ƿ�ɹ���"+success);
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        //�Ӽ����л�ȡԪ��
        String name = list.get(2);
        System.out.println("�ڶ�������λ��:"+name);
        //�Ӽ�����ɾ��Ԫ��
        String remove = list.remove(3);
        System.out.println("��ɾ��������˭��"+remove);
        System.out.println(list);
        //��ȡ���ϳ���
        int size = list.size();
        System.out.println("���ϵĳ����ǣ�"+size);
    }
}
