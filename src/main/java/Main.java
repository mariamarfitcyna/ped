import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        LocalDate date = LocalDate.of(2023, 3, 3);
        Product pr = new Product("cheese", 8f, date, 4);
        boolean t = pr.isGood();
        System.out.println(t);
    }
}
