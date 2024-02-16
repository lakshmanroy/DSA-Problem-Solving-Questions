public class Break_Statement {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if (i==4) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop");
    }
}
