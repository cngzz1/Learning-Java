public class Carpet {
    private double cost;

    public Carpet(double price){
        this.cost = price < 0 ? 0 : price;
    }

    public double getCost(){
        return this.cost;
    }
}