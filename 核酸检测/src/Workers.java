public class Workers extends People{
    private String hospital;
    private String ueserDate = "一周测一次";

    public Workers(){
        super();
    }
    public void sample(){
        System.out.println("Workers类中的sample方法");
    }

    public void resultEnter(){
        System.out.println("Workers类中的resultEnter方法");
    }
    public void test(){
        System.out.println("Workers类中test方法");
    }

    @Override
    public void backHome() {
        super.backHome();
        System.out.println(this.getName()+"已经回家"+"继承测试"+ueserDate);
    }
}
