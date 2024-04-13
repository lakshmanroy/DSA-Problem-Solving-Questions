public class SingleLevel_Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.fish();
        b.eat();
    }
}

class Animals {
    void eat() {
        System.out.println();
    }

    void breathe() {
        System.out.println("breathe");
    }
}

class Base extends Animals {
    void fish() {
        System.out.println("fish in water");
    }
}
