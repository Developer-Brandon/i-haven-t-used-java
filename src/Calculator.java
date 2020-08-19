class Adder {
    private int cntAdd;
    Adder () {
        cntAdd = 0;
    }
    int getCntAdd() {
        return cntAdd;
    }
    int addTwoNumber(int num1, int num2) {
        cntAdd++;
        return num1 + num2;
    }
}

class SubTractor {
    private int cntSub;
    SubTractor () {
        cntSub = 0;
    }
    int getCntSub () {
        return cntSub;
    }
    int subTwoNumber(int num1, int num2) {
        cntSub++;
        return num1 - num2;
    }
}


public class Calculator {
    private Adder adder;
    private SubTractor subTractor;

    public Calculator() {
        adder = new Adder();
        subTractor = new SubTractor();
    }

    public int addTwoNumber(int num1, int num2) {
        return adder.addTwoNumber(num1, num2);
    }

    public int subTwoNumber(int num1, int num2) {
        return subTractor.subTwoNumber(num1,num2);
    }

    public void showOperatingTimes() {
        System.out.println("덧셈 횟수 : " + adder.getCntAdd());
        System.out.println("뺄셈 횟수 : " + subTractor.getCntSub());
    }
}