import java.util.*;
public class Strings {
    public static float displacement(String coOrdinates) {
       int x=0,y=0;
       for(int i =0;i<coOrdinates.length();i++) {
        char dir=coOrdinates.charAt(i);
        //for south
        if(dir=='S') {
            y--;
        }
        //for north
        else if(dir == 'N') {
            y++;
        }
        //for east
        else if(dir == 'E') {
            x++;
        }
        //for west
        else{
            x--;
        }
       }
       int Xsq=x*x;
       int Ysq=y*y;
       return (float)Math.sqrt(Xsq + Ysq);
       
    }
    public static void main(String args[]) {
        //E-east,W-west,N-north,S-south
        String coOrdinates = "WNESWENNNSSEW";
        System.out.print(displacement(coOrdinates));
        
    }
}
