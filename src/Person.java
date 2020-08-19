public class Person {
    private int perID;
    private int milID;
    private int birthYear;
    private int birthMonth;
    private int birthDay;

    public Person(int perID, int milID, int birthYear, int birthMonth, int birthDay) {
        this.perID = perID;
        this.milID = milID;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
    }

    public Person(int pID, int birthYear, int birthMonth, int birthDay) {
        this(pID, 0, birthYear, birthMonth, birthDay);
    }

    public void showInfo() {
        System.out.println("민번: " + perID);
        System.out.println("생년월일: " + birthYear + birthMonth + birthDay);
        System.out.println("군번: " + milID);
        System.out.println("군과 관계 없음 \n");
    }
}
