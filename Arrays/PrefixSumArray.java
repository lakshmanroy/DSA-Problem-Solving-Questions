package Arrays;

public class PrefixSumArray {
    public static void prefixSumArray(int number[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]= new int[number.length];

        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+number[i];
        }
       for(int i=0;i<number.length;i++){
        int start=i;
        for(int j=i;j<number.length;j++){
            int end=j;
            currSum= start==0? prefix[end]:prefix[end]-prefix[start-1];

            if (maxSum<currSum) {
                maxSum=currSum;
            }
        }
    }
       System.out.println("max prefix of Array:" +maxSum);
    }
    public static void main(String[] args) {
        int number[]= {1,-2,4,6,1};
        prefixSumArray(number);
    } 
}
