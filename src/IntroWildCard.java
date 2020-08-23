class Fruit {
    public void showYou() {
        System.out.println("난 과일입니다");
    }
}

class Apple extends Fruit {
    public void showYou() {
        super.showYou();
        System.out.println("그리고 난 붉은과일입니다");
    }
}

class FruitBox<T> {
    // 1.
    T item;
    // 2.
    public void store(T item) {
        this.item = item;
    }
    // 3.
    public T pullOut() {
        return item;
    }
}

public class IntroWildCard {
    public static void openAndShowFruitBox(FruitBox<? extends Fruit> box) {
        Fruit fruit = box.pullOut();
        fruit.showYou();
    }
    public static void main(String[] args) {
        FruitBox<Fruit> box = new FruitBox<Fruit>();
        box.store(new Fruit());
        FruitBox<Apple> box2 = new FruitBox<Apple>();
        box2.store(new Apple());

        openAndShowFruitBox(box);
        openAndShowFruitBox(box2);
    }
}
