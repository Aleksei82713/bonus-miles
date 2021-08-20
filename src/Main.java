public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = 20;
        int calculation = price/miles;
        System.out.println(calculation);

    }

}
