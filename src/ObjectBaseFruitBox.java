// 오렌지 클래스
class Orange {
    // 당분함량
    int sugarContent;
    // 생성자
    public Orange(int sugar) {
        sugarContent = sugar;
    }
    // 당도를 보여주는 메소드
    public void showSugarContent() {
        System.out.println("당도" + sugarContent);
    }
}


// 무엇이든 저장 가능한 박스
class FruitBox {
    // 무엇이든 저장하기위한 변수
    Object item;
    // 저장하는 메소드
    public void store(Object item) {
        this.item = item;
    }
    // 꺼내는 메소드
    public Object pullOut() {
        return item;
    }
}

public class ObjectBaseFruitBox {
    public static void main(String[] args) {
        FruitBox fBox1 = new FruitBox();
        fBox1.store(new Orange(10));
        Orange org1 = (Orange) fBox1.pullOut();
        org1.showSugarContent();

        FruitBox fBox2 = new FruitBox();
        fBox2.store("오렌지");
        Orange org2 = (Orange) fBox2.pullOut();
        org2.showSugarContent();
    }
}
