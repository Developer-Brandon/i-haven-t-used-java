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
        int[][] dummyArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        addTwoDArr(dummyArray, 3);
        for(int i = 0; i < dummyArray.length; i++) {
            for(int j = 0; j < dummyArray[i].length; j++) {
                System.out.println("dummyArray[i][j]" + dummyArray[i][j]);
            }
        }
    }
}
