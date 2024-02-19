package Arrays;

public class LargestArray {
    //largest number
    public static int largestNumber(int number[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if (largest<number[i]) {
                largest=number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int number[]={2,4,10,6,8};
        System.out.println("largest number is:" +largestNumber(number));
    }
}
