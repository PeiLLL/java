package P11.Interface;
/*
从java 8 开始接口里允许定义默认方法
格式；
public default 返回值类型 方法名称(参数列表){
    方法体
}

 */
public interface MyinterfaceDefault {
        //抽象方法
        public abstract void method();

        //新添加的抽象方法
       // public abstract void method2();

        //默认方法
        public default void methodDefault(){
                System.out.println("新添加的默认方法");
        }
}
