package genericExample;

interface SimpleInterface {
    public void showYourName();
}

class UpperClass {
    public void showYourAncestor() {
        System.out.println("genericExample.UpperClass");
    }
}

class AAA extends UpperClass implements SimpleInterface {
    @Override
    public void showYourName() {
        System.out.println("Class genericExample.AAA");
    }
}

class BBB extends UpperClass implements SimpleInterface {
    @Override
    public void showYourName() {
        System.out.println("Class genericExample.BBB");
    }
}

public class BoundedTypeParam {
    public static <T> void showInstanceAncestor(T param) {
        ((SimpleInterface)param).showYourName();
    }

    public static <T> void showInstanceName(T param) {
        ((UpperClass)param).showYourAncestor();
    }

    public static void main(String[] args) {
        AAA aaa = new AAA();
        BBB bbb = new BBB();

        showInstanceAncestor(aaa);
        showInstanceName(aaa);
        showInstanceAncestor(bbb);
        showInstanceName(bbb);
    }
}
