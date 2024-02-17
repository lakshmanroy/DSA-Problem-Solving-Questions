public class Swap_Function {
    public static void Swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }

    public static int multiply(int x,int y){
        int product=x*y;
        return product;
    }
    public static void main(String[] args) {
        int a=5;
        int b=10;

        Swap(a, b);
        System.out.println("a=" +a);
        System.out.println("b=" +b);

        System.out.println("__________________________");
        
        int x=10;
        int y=5;

        int prod=multiply(x, y);
        System.out.println("a*b=" +prod);

        prod=multiply(10, 20);
        System.out.println("a*b=" +prod);
        
    }
}
