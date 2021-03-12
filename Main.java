public class Main {
    public static void main(String[] args) {
        int percent;
        int transfer = 1100;
        if (transfer >= 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int cash = 100 + transfer;
        int bonus = (cash * percent) / 100;
        int summ = bonus + cash;
        System.out.println(summ);
    }
}