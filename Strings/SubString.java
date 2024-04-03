package Strings;

public class SubString {
    public static String Sub(String str,int si,int ei){
        String subStr= "";
        for(int i=si;i<ei;i++){
            subStr+= str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String str= "Lakshman";

        System.out.println(Sub(str, 0, 5));
    }
    
}
