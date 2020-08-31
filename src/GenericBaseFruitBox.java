class Orange {
    //
    int sugarContent;

    public Orange(int sugar) {
        this.sugarContent = sugar;
    }

    public void showSugarContent() {
        System.out.println("당도" + sugarContent);
    }
}

class Apple {
    //
    int weight;
    //
    public Apple(int weight) {
        this.weight = weight;
    }
    //
    public void showAppleWeight() {
        System.out.println("무게" + weight);
    }
}

class FruitBox<T> {
    //
    T item;
    //
    public FruitBox(T item){
        this.item = item;
    }
    //
    public void store(T item) {
        this.item = item;
    }
    //
    public T pullOut() {
        return item;
    }
}


public class GenericBaseFruitBox {
    public static void main(String[] args) {
        FruitBox<Orange> orangeFruitBox = new FruitBox<Orange>(new Orange(10));
        Orange orange = orangeFruitBox.pullOut();
        orange.showSugarContent();

        FruitBox<Apple> appleFruitBox = new FruitBox<Apple>(new Apple(20));
        Apple apple = appleFruitBox.pullOut();
        apple.showAppleWeight();
    }
}
