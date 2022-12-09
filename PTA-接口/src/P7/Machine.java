package P7;

public class Machine {
    public void checkProduct(Product product) throws DefectException{
        if(product.getIsDefect()){
            DefectException defect = new DefectException();
            throw defect;
        }
        else{
            System.out.print(product.getName()+"不是次品! ");
        }
    }
}
