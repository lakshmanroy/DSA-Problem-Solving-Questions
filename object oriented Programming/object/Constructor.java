// package object oriented Programming.object;

public class Constructor {
    public static void main(String[] args) {
        Student p1 = new Student();
        Student p2 = new Student("Lakshman");
        System.out.println(p2.name);
    }
}

class Student {
    String name;
    int roll;

    Student() {
        System.out.println("String are constructor...");
    }

    Student(String name) {
        this.name = name;
    }
}