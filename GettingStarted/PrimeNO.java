package FJPLevel1.GettingStarted;

import java.util.*;

public class PrimeNO {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t=scn.nextInt();
        for(int i=0;i<t;i++){
            boolean isprime=true;
            int n=scn.nextInt();
            int div=2;
            while(div*div<=n){
                if(n%div==0){
                    isprime=false;
                    break;
                }
                div++;
            }
            if(isprime==true){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }
        }
        scn.close();
     }
}
