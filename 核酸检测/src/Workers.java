public class Workers extends People{
    private String hospital;
    private String ueserDate = "һ�ܲ�һ��";

    public Workers(){
        super();
    }
    public void sample(){
        System.out.println("Workers���е�sample����");
    }

    public void resultEnter(){
        System.out.println("Workers���е�resultEnter����");
    }
    public void test(){
        System.out.println("Workers����test����");
    }

    @Override
    public void backHome() {
        super.backHome();
        System.out.println(this.getName()+"�Ѿ��ؼ�"+"�̳в���"+ueserDate);
    }
}
