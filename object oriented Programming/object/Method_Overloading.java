public class Method_Overloading {
    public static void main(String[] args) {
        Calculator s1 = new Calculator();
        System.out.println(s1.sum(4, 4));
        System.out.println(s1.sum(4.2f, 4.8f));
        System.out.println(s1.sum(4, 4, 9));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}