package P9;

public class Truck{
    ComputerWeight[] goods;

    public ComputerWeight[] getGoods() {
        return goods;
    }

    public void setGoods(ComputerWeight[] goods) {
        this.goods = goods;
    }

    public Truck(ComputerWeight[] goods) {
        this.goods = goods;
    }

    public double getTotalWeights() {
        double sum = 0;
        for(int i = 0; i<goods.length; i++){
            sum += goods[i].computeWeight();
        }
        return sum;
    }

}
