public class Hierarchial_Inheritance {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.fly();
        b.eat();
    }
}

class Animals {
    void eat() {
        System.out.println("eat");
    }

    void breathe() {
        System.out.println("breathe.");
    }
}

class Mamals extends Animals {
    void walk() {
        System.out.println("walks..");
    }
}

class Fish extends Animals {
    void fish() {
        System.out.println("fish");
    }
}

class Bird extends Animals {
    void fly() {
        System.out.println("fly");
    }
}
