public class AddOrEven {
    public static void addOrEven(int n){
        int bitMask=1;
        if ((n& bitMask)==0) {
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        addOrEven(3);
        addOrEven(13);
        addOrEven(14);
        
    }
    
}
