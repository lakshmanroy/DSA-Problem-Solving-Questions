public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        Dog dubby = new Dog();
        dubby.leg = 3;
        System.out.println(dubby.leg);
        dubby.eat();
    }
}

class Animals {
    void eat() {
        System.out.println("eats..");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

class Mamals extends Animals {
    int leg;

    void leg() {
        System.out.println("leg..");
    }
}

class Dog extends Mamals {
    void fish() {
        System.out.println("fish..");
    }
}
