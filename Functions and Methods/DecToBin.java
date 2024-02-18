public class DecToBin {
    public static void binTodec(int decNum){
        int myNum=decNum;
        int pow=0;
        int binNum=0;
        while (decNum>0) {
            int lastDigit=decNum%2;
            binNum=binNum+(lastDigit*(int)Math.pow(10,pow));
            pow++;
            decNum=decNum/2;
        }
        System.out.println("Binary number:" +myNum+ "=" +binNum);
    }
    public static void main(String[] args) {
        binTodec(7);
    }
}
