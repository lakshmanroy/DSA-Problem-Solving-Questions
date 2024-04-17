public class Static_keyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.scholName = "Jvm";

        Student s2 = new Student();
        System.out.println(s2.scholName);

    }
}

class Student {
    String name;
    int roll;

    static String scholName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}