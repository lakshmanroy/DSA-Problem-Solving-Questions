package Strings;

public class CharAtString {
    public static void printLetter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        String firstName= "Lakshman";
        String secondname= "Riya";
        String fullName= firstName + " " +secondname;
       printLetter(fullName);
    }
    
}
