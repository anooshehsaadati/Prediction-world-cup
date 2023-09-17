public class Predictor {
    public static int predict(int year) {
        // TODO: Implement
        int worldCup = 0;
        int res = year % 4;
        switch (res) {
            case 0:
                worldCup = year + 2;
                break;
            case 1:
                worldCup = year + 1;
                break;
            case 2:
                worldCup = year;
                break;
            case 3:
                worldCup = year + 3;
                break;
        }
        return worldCup;
    }

    public static void main(String[] args) {
        System.out.println(predict(2021)); // 2022
        System.out.println(predict(2022)); // 2022
        System.out.println(predict(2023)); // 2026
    }
}