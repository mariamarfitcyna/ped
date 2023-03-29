import java.time.LocalDate;

class Product extends Goods{

    private LocalDate date;
    private int bestBeforeDate;

    public Product(String _name, Float _price, LocalDate _date, int _bestBeforeDate){
        super(_name, _price);
        date = _date;
        bestBeforeDate = _bestBeforeDate;
    }

    @Override
    public boolean isGood() {
        int currentDay = LocalDate.now().getDayOfMonth();
        int theLastDayOfBestBeforeDate = date.getDayOfMonth() + bestBeforeDate;
        if (currentDay > theLastDayOfBestBeforeDate){
            return false;
        }
        return true;
    }

    @Override
    public void getParametrs() {
        //придумаешь сам??
    }
}
