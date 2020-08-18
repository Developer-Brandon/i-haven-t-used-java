public class Main {

    public static void main(String[] args) {
        // example 1
        int sum = 1;
        for (int i = 1,j = 10; i<=j; i++) {
            sum = sum * i;
            System.out.println("1부터 10까지 곱하는 과정: " + sum);
        }
        System.out.println("1부터 10까지 곱하는 결과: " + sum);

        // example 2
        int standardValueOfGuGudan = 5;
        for (int i = 1, j = 9; i<=j; i++) {
            System.out.println("구구단을 외자(5단): " + standardValueOfGuGudan * i);
        }
    }
}
