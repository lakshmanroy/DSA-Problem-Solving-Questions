public class Floyds_tringle {
    public static void floyds_tringle(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyds_tringle(5);
    }
}
