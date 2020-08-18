class Number {
    int num = 0;
    public void addNum(int n) {
        num += n;
    }
    public int getNumber() {
        return num;
    }
}

public class Main {
    public static void simpleMethod(Number numberParam) {
        numberParam.addNum(12);
    }

    public static void main(String[] args) {
        Number newInstance = new Number();
        System.out.println("메소드 호출 전: " + newInstance.getNumber());

        simpleMethod(newInstance);
        System.out.println("메소드 호출 후: " + newInstance.getNumber());
    }
}
