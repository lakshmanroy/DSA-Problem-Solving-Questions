package Strings;

public class Equal {
    public static void main(String[] args) {
        String str1= "Tonny";
        String str2= "Tonny";
        String str3= "Tonny";

        if (str1==str2) {
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }
        if (str1.equals(str3)) {
            System.out.println("String are not equal");
        }
        else{
            System.out.println("String are not equals");
        }
    }
    
}
