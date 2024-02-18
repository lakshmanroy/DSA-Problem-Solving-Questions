public class Hollow_Rectangle {
    public static void hollow_Rectangles(int totRow,int totColm){
        for(int i=1;i<=totRow;i++){
            for(int j=1;j<=totColm;j++){
                if (i==1 || i==totRow || j==1 || j==totColm) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        hollow_Rectangles(4, 5);
    }
}
