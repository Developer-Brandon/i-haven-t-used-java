public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 8; i += 2) {
            if (i > 0) {
                if (i == 2 || i == 4 || i == 6 || i == 8) {
                    for (int j = 1; j <= i; j++) {
                        System.out.println("구구단 " + i + "단: " + i + " x " + j + " = " + i * j);
                    }
                }
            }
        }

    }
}
