public abstract class Goods implements Comparable<Goods>{

    public Goods(String _name, Float _price){
        name = _name;  // Название
        price = _price;  // Цена
    }

    private final String name;
    private final float price;

    protected abstract boolean isGood();
    protected abstract void getParameters();

    protected void printCommonInfo()
    {
        System.out.printf("Название: %s%n", name);
        System.out.printf("Цена: %s%n", price);
    }

    public int compareTo(Goods item){
        if (price > item.price)
            return 1;
        else if (price < item.price)
            return -1;
        return 0;
    }
}
