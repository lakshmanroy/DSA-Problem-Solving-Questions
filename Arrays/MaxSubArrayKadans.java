package Arrays;

public class MaxSubArrayKadans {
    public static void kadans(int number[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){
            cs=cs+number[i];
            if (cs<0) {
                cs=0;
            }
            ms=Math.max(ms,cs);
        }
        System.out.println("Our max subarray is :" +ms);

    }
    public static void main(String[] args) {
        int number[]= {-2,-3,4,-1,-2,1,5,-3};
        kadans(number);
    }
}
