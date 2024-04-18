public class Abstract_Classes {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // // Chicken c = new Chicken();
        // // c.eat();
        // // c.walk();
        // System.out.println(h.color);

        Mustag m = new Mustag();
        // Animals->Horse->Mustag
    }

}
abstract class Animals {
    String color;

    Animals() {
        // color = "brown";
        System.out.println("Animals constructor called");
    }

    void eat() {
        System.out.println("Animals eat.");
    }

    abstract void walk();
}

class Horse extends Animals {
    Horse() {
        System.out.println("Horse constructor called");
    }

    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustag extends Horse {
    Mustag() {
        System.out.println("Mustag constructor called");
    }
}

class Chicken extends Animals {
    void changeColor() {
        color = "Red";
    }

    void walk() {
        System.out.println("walks on 2 leg");
    }
}
