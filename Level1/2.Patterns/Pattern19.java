package FJPLevel1.Patterns;
import java.util.*;
public class Pattern19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1;i<=n;i++){
            if(i==1){
                for(int j=1;j<=n;j++){
                    if(j<=n/2+1 || j==n){
                        System.out.print("*	");
                    }else{
                        System.out.print("	");
                    }
                }
            }
            else if(i<=n/2){
                for(int j=1;j<=n;j++){
                    if(j==n/2+1 || j==n){
                        System.out.print("*	");
                    }else{
                        System.out.print("	");
                    }
                }
            }else if(i==n/2+1){
                for(int j=1;j<=n;j++){
                    System.out.print("*	");
                }
            }else if(i>n/2+1 && i<n){
                for(int j=1;j<=n;j++){
                    if(j==1 || j==n/2+1){
                        System.out.print("*	");
                    }else{
                        System.out.print("	");
                    }
                }
            }else{
                for(int j=1;j<=n;j++){
                    if(j==1 || j>=n/2+1){
                        System.out.print("*	");
                    }else{
                        System.out.print("	");
                    }
                }
            }
            System.out.println();
        }
        scn.close();
      }
}
