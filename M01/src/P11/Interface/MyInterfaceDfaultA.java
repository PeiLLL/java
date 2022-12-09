package P11.Interface;

import javax.sound.midi.Soundbank;
import java.util.NoSuchElementException;

public class MyInterfaceDfaultA implements MyinterfaceDefault{
    @Override
    public void method() {
        System.out.println("实现了抽象方法A");
    }

    @Override
    public void methodDefault() {
        //MyinterfaceDefault.super.methodDefault();
        System.out.println("实现类A重写默认方法");
    }
}
