import java.util.ArrayList;

public class Kit extends Goods{

    private final ArrayList<Product> productList;

    public Kit(String _name, Float _price, ArrayList<Product> _productList){
        super(_name, _price);
        productList = _productList;  // Список продуктов
    }

    public ArrayList<Product> detectExpiredProducts(){
        ArrayList<Product> expiredProducts = new ArrayList<>();
        for (Product product : productList)
            if (!product.isGood())
                expiredProducts.add(product);
        return expiredProducts;
    }
    @Override
    protected boolean isGood() {
        return detectExpiredProducts().size() == 0;
    }

    @Override
    protected void getParameters() {
        System.out.println("Информация о наборе:");
        for (Product product : productList)
            product.getParameters();
    }
}
