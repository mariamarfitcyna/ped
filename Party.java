import java.time.LocalDate;

public class Party extends Product {
    private final int count;

    public Party(String _name, Float _price, LocalDate _productionDate, int _expirationDate, int _count) {
        super(_name, _price, _productionDate, _expirationDate);
        count = _count;  // Количество в партии
    }

    @Override
    public void getParameters() {
        super.getParameters();
        System.out.printf("Количество в партии: %s%n", count);
    }
}
