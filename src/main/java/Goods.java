import java.io.File;

public abstract class Goods implements Comparable<Goods>{

    public Goods(String _name, Float _price){
        name = _name;
        price = _price;
    }

    private String name;
    private float price;

    public abstract boolean isGood();
    public abstract void getParametrs();

    public int compareTo(Goods item){
        if (price > item.price){
            return 1;
        } else if (price < item.price) {
            return -1;
        }
        return 0;
    }
}
