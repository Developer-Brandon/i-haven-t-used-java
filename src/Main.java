public class Main {

    public static void main(String[] args) {
        /* */

        // 더 나아가야할 점, 보완해야할 점, 진행상황
        // 1. collection framework 전까지 학습완료
        // 2. collection framework는 자료구조, 알고리즘과 관련이 많으므로 자료구조/알고리즘과 관련된 강의를 다 들은 후에 다시 학습할 것
        // 3. 백준의 알고리즘과 기존에 진도가 나가지않은 책 [난 정말 JAVA를 공부한적이 없어요]를 병행해도 괜찮을 듯

        // 문제 풀이 및 정리
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

        //

    }
}
