package Strings;

public class getSortedPath {
   public static float getShorted(String name){
    int x=0,y=0;
    for(int i=0;i<name.length();i++){
       char dir=name.charAt(i);
       if (dir=='S') {
         y--;
       }
       else if (dir=='N') {
        y++;
       }
       else if (dir=='E') {
        x++;
       }
       else if (dir=='W') {
         x--;
       }
    }
    int X2= x*x;
    int Y2= y*y;
    return (float)Math.sqrt(X2+Y2);
   }
    public static void main(String[] args) {
        String name= "WNEENESENNN";

        System.out.println(getShorted(name));
        
    }
    
}
