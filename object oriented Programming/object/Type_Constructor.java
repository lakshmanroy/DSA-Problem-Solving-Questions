// package object oriented Programming.object;

public class Type_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Riya");
        Student s3 = new Student(123);
    }
}

class Student {
    String name;
    int roll;

    Student() {
        System.out.println("String are constures..");

    }

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}