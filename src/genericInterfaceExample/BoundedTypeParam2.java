package genericInterfaceExample;


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

public class BoundedTypeParam2 {

    public static <T extends SimpleInterface> void showInstanceAncestor(T params) {
        params.showYourName();
    }

    public static <T extends UpperClass> void showInstanceName(T params) {
        params.showYourAncestor();
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
