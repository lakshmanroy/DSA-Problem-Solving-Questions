public class Method_Overriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animals {
    void eat() {
        System.out.println("eat anythings");
    }
}

class Deer extends Animals {
    void eat() {
        System.out.println("eats glass");
    }
}
