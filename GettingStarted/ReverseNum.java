package FJPLevel1.GettingStarted;
import java.util.*;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        while(n>0){
            int r=n%10;
            n=n/10;
            System.out.println(r);
        }


        scn.close();
        
     }
}
