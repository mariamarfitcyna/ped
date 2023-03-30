import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args){
        LocalDate date1 = LocalDate.of(2023, 3, 27);
        LocalDate date2 = LocalDate.of(2023, 3, 8);
        LocalDate date3 = LocalDate.of(2023, 3, 31);
        LocalDate date4 = LocalDate.of(2023, 4, 1);

        Product product1 = new Product("Cheese-cake", 100f, date1, 3);
        Product product2 = new Product("Orange", 50f, date2, 4);
        Product product3 = new Product("Cheese-cake", 10f, date3, 10);
        Party party1 = new Party("Сroissants", 75f, date4, 2, 5);

        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(party1);
        Collections.sort(productList);  // Сортировка по возрастанию цены


        Kit kit = new Kit("BaseKit", 1000f, productList);
        kit.getParameters();  //  Информация о каждом продукте
        System.out.println(kit.isGood());  // Все ли продукте годны в наборе?
        ArrayList<Product> expiredProducts = kit.detectExpiredProducts(); // Товары с истекшим сроком годности
        for (Product product : expiredProducts)
            product.getParameters();  // Вся информация о товарах с истекшим сроком годности
    }
}
