public class Super_keyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animals {
    String color;

    Animals() {
        System.out.println("animals constructor is called..");
    }
}

class Horse extends Animals {
    Horse() {
        super.color = "blue";
        System.out.println("Horse constructor is called");
    }
}
