import java.time.LocalDate;

class Product extends Goods{

    private final LocalDate productionDate;
    private final int expirationDate;

    public Product(String _name, Float _price, LocalDate _productionDate, int _expirationDate){
        super(_name, _price);
        productionDate = _productionDate;  // Дата изготовления
        expirationDate = _expirationDate;  // Срок годности
    }

    @Override
    public boolean isGood() {
        return productionDate.getDayOfYear() + expirationDate >= LocalDate.now().getDayOfYear();
    }

    @Override
    public void getParameters() {
        printCommonInfo();
        System.out.printf("Дата изготовления: %s%n", productionDate);
        System.out.printf("Срок годности: %s дня %n", expirationDate);
        System.out.printf("Товар годен на текущую дату: %s%n", isGood());
    }
}
