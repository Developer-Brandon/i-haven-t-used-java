public class Main {

    public static void showHi(int cnt) {
        System.out.println("Hi~");
        showHi(cnt--);
        if (cnt == 1)
            return;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        showHi(3);
    }
}
