import static java.lang.String.valueOf;

class FruitSeller {
    int numOfApple;
    int myMoney;
    int APPLE_PRICE;

    public int saleApple(int money) {
        int num = money / APPLE_PRICE;
        numOfApple -= num;
        myMoney += money;
        return num;
    }

    public void showSaleResult() {
        System.out.println("남은 사과 : " + numOfApple);
        System.out.println("판매 수익 : " + myMoney);
        System.out.println("");
    }

    public void initMembers(int money, int appleNum, int price) {
        myMoney = money;
        numOfApple = appleNum;
        APPLE_PRICE = price;
    }
}

class FruitBuyer {
    int myMoney = 10000;
    int numOfApple = 0;

    public void buyApple(FruitSeller seller, int money) {
        numOfApple += seller.saleApple(money);
        myMoney -= money;
    }

    public void showBuyResult() {
        System.out.println("현재 잔액 : " + myMoney);
        System.out.println("사과 개수 : " + numOfApple);
    }
}

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

    public static void showHi(int cnt) {
        System.out.println("Hi~");
        showHi(cnt--);
        if (cnt == 1)
            return;
    }

    public static void main(String[] args) {
        /* */

        // 더 나아가야할 점, 보완해야할 점, 진행상황
        // 1. collection framework 전까지 학습완료
        // 2. collection framework는 자료구조, 알고리즘과 관련이 많으므로 자료구조/알고리즘과 관련된 강의를 다 들은 후에 다시 학습할 것
        // 3. 백준의 알고리즘과 기존에 진도가 나가지않은 책 [난 정말 JAVA를 공부한적이 없어요]를 병행해도 괜찮을 듯

        // 문제 풀이 및 정리


        // feature/first-java-program
        System.out.println("Welcome to Java");
        System.out.println("First Java program");
        // 1. Java source code를 compiler가 bite code로 변경
        // 2. Example.java -> 이게 java scource code
        // 3. Java byte code란? -> java compiler에 의해 생성되는 코드이다.
        // 결론 Example.java -> [javac.exe(javac compiler)] compile.... -> [Example.class | Java virtual machine] 이 두개는 java.exe에 의해 실행됨

        // feature/88p-4-1-1
        /*
        int num1,num2,num3;
        num1 = 10;
        num2 = 20;
        num3 = 30;

        num1 = num2 = num3;

        System.out.println("Result of num1 - " + num1);
        */

        // feature/do-white-basic
        /*
        int num = 0;
        do {
            System.out.println("I like java " + num);
            num++;
        }
        while (num < 5);
        */

        // feature/fruit-sales-main
        /*
        FruitSeller seller1 = new FruitSeller();
        seller1.initMembers(0, 30, 1500);

        FruitSeller seller2 = new FruitSeller();
        seller2.initMembers(0, 20, 1000);

        FruitBuyer buyer = new FruitBuyer();
        buyer.buyApple(seller1, 4500);
        buyer.buyApple(seller2, 2000);

        System.out.println("과일 판매자 1의 현재 상황");
        seller1.showSaleResult();

        System.out.println("과일 판매자 2의 현재 상황");
        seller2.showSaleResult();

        System.out.println("과일 구매자의 현재 상황");
        buyer.showBuyResult();
        */

        // feature/inf-recul
        /*
        System.out.println("Hello World!");
        showHi(3);
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
        /*
        int A = ((25+5)+(36/4)-72)*5;
        int B = ((25*5)+(36-4)+71)/4;
        int C = (128/4)*2;

        boolean isBig = (A>B) && (B>C);
        System.out.println(isBig);
        */

        // feature/115P-5-1-1
        /*
        int num = 120;
        if (num > 0 && (num % 2) == 0)
            System.out.println("num은 양수이면서 짝수입니다");
        */

        // feature/115P-5-1-2
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


        // feature/127p
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

        // feature/131p-5-5
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

        // feature/143p-5-7
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

        // feature/347p-13-1
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
