public class CtsOverloading {
    public static void main(String[] args) {
        Person man = new Person(951203, 880102, 1995, 12, 3);
        Person woman = new Person(991107, 1999, 11, 7);
        man.showInfo();
        woman.showInfo();
    }
}