public class FastExpro {
    public static int fastExpro(int n,int a){
        int ans=1;
        while (n>0) {
            if ((n & 1)!=0) {
                ans= ans * a;
            }
            a= a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExpro(5, 3));
        
    }
    
}
