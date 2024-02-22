package Arrays;

public class Pairse {
    public static void printPairs(int number[]){
        for(int i=0;i<number.length;i++){
            int curr=number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("(" +curr+ "," +number[j]+ ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        printPairs(number);
    }
}