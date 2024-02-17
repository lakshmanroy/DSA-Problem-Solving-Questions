public class Function_Overloading {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(2, 7));
        System.out.println(sum(3,8, 15));
    }
}
