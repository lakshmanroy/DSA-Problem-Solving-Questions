public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.swim();
        shark.eat();
    }
}

class Animals {
    void eat() {
        System.out.println("eats..");
    }

    void breathe() {
        System.out.println("breathe..");
    }
}

class Fish extends Animals {
    void swim() {
        System.out.println("swim in water");
    }
}
