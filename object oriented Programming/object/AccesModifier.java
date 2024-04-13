// package object oriented Programming.object;

public class AccesModifier {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.userName = "Lakshman";
        myAcc.setPassword("abcdefghi");
    }
}

class BankAccount {
    public String userName;
    private String Password;

    public void setPassword(String pwd) {
        Password = pwd;
    }
}
