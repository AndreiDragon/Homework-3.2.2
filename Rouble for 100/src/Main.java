public class Main {
    public static void main(String[] args) {
        long account = 100;
        long replenish = 2000;
        long bonus = 0;
        if (replenish > 1000) {
            bonus = bonus + replenish / 100;
        }
        System.out.println(account+replenish+bonus);
        System.out.println(bonus);
    }
}