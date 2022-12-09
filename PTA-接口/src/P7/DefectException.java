package P7;

public class DefectException extends Exception{
    String message;

    DefectException(){
    }
    public void toShow(){
        System.out.print("´ÎÆ·!");
    }
}
