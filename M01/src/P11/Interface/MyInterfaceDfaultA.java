package P11.Interface;

import javax.sound.midi.Soundbank;
import java.util.NoSuchElementException;

public class MyInterfaceDfaultA implements MyinterfaceDefault{
    @Override
    public void method() {
        System.out.println("ʵ���˳��󷽷�A");
    }

    @Override
    public void methodDefault() {
        //MyinterfaceDefault.super.methodDefault();
        System.out.println("ʵ����A��дĬ�Ϸ���");
    }
}
