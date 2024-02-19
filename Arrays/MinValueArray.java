package Arrays;

public class MinValueArray {
    public static int minValue(int number[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if (smallest>number[i]) {
                smallest=number[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int number[]= {8,6,97,2,4};
        System.out.println("minimum number of :"+minValue(number));
    }  
}
