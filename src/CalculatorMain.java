public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("1+2=" + calculator.addTwoNumber(1,2));
        System.out.println("2+4=" + calculator.addTwoNumber(2, 4));
        System.out.println("5-1=" + calculator.subTwoNumber(5,1 ));
        calculator.showOperatingTimes();
    }
}
