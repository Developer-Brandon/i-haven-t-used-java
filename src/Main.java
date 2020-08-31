import static java.lang.String.valueOf;

public class Main {
    public static void addOneDArr(int[] arr, int add) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += add;
        }
    }

    public static void addTwoDArr(int[][] arr, int add) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] += add;
            }
        }
    }

    public static void main(String[] args) {
        /* */

        // 더 나아가야할 점, 보완해야할 점, 진행상황
        // 1. collection framework 전까지 학습완료
        // 2. collection framework는 자료구조, 알고리즘과 관련이 많으므로 자료구조/알고리즘과 관련된 강의를 다 들은 후에 다시 학습할 것
        // 3. 백준의 알고리즘과 기존에 진도가 나가지않은 책 [난 정말 JAVA를 공부한적이 없어요]를 병행해도 괜찮을 듯

        // 문제 풀이 및 정리

        // feature/88p-4-1-1
        /*
        int num1,num2,num3;
        num1 = 10;
        num2 = 20;
        num3 = 30;

        num1 = num2 = num3;

        System.out.println("Result of num1 - " + num1);
        */

        // feature/88p-4-1-2

        // feature/88p-4-1-3
        /*
        int A = 25 * 5;
        int B = 36 - 4;
        int C = 72;
        System.out.println("RESULT - "+ (A+B-C) / 5);
        */

        // feature/88p-4-1-4
        /*
        int A = 3+6;
        int B = A+9;
        int C = B+12;
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        */

        // feature/88p-4-1-5


        // 115P-5-1-1
        /*
        int num = 120;
        if (num > 0 && (num % 2) == 0)
            System.out.println("num은 양수이면서 짝수입니다");
        */

        // 115P-5-1-2
        /*
        int num = 220;
        if(num < 0) {
            System.out.println("0미만");
        } else if(num < 100) {
            System.out.println("0이상 100미만");
        } else if(num < 200) {
            System.out.println("100이상 200미만");
        } else if(num < 300) {
            System.out.println("200이상 300미만");
        } else if(num >= 300) {
            System.out.println("300이상");
        }
        */


        // 127p
        // example 1
        /*
        int num = 0, sum = 0;
        while(num < 100) {
            sum += num;
            num ++;
            System.out.println("num: " + num);
        }
        System.out.println("sum: " + sum);

        // example 2
        int num2 = 0;
        while(num2 < 100) {
            num2++;
            System.out.println("1~100까지 작성: " + num2);
        }
        //
        do {
            num2--;
            System.out.println("100~1까지 작성: " + num2);
        } while(num2 >= 1);

        // example 3
        int num3 = 0, sum2 = 0;
        while(num3 <= 1000) {
            num3++;
            if((num3 % 2 == 0) && (num3 % 7 == 0)) {
                System.out.println("2의 배수이면서, 7의 배수: " + num3);
                sum2 += num3;
            }
        }
        System.out.println("2의 배수이면서, 7의 배수의 합: "+sum2);
        */

        // 131p-5-5
        /*
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
        */

        // 143p-5-7
        /*
        for (int i = 0; i <= 8; i += 2) {
            if (i > 0) {
                if (i == 2 || i == 4 || i == 6 || i == 8) {
                    for (int j = 1; j <= i; j++) {
                        System.out.println("구구단 " + i + "단: " + i + " x " + j + " = " + i * j);
                    }
                }
            }
        }
        */

        // 347p-13-1
        /*
        int[][] dummyArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        addTwoDArr(dummyArray, 3);
        for (int i = 0; i < dummyArray.length; i++) {
            for (int j = 0; j < dummyArray[i].length; j++) {
                System.out.println("dummyArray[i][j]" + dummyArray[i][j]);
            }
        }
        */
    }
}
