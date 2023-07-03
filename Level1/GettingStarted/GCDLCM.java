package FJPLevel1.GettingStarted;

import java.util.*;

public class GCDLCM {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        
        int t1=n1;
        int t2=n2;
        while(t1%t2 != 0){
            int r=t1%t2;
            t1=t2;
            t2=r;
        }
        int gcd=t2;
        int lcm=(n1*n2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);

        
        scn.close();
       }
}
