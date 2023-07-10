package FJPLevel1.Patterns;
import java.util.*;
public class Pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int space=n/2;
        int temp=1;
        for(int i=1;i<=n;i++){
            if(i<=n/2){
                for(int j=1;j<=space;j++){
                    System.out.print("	");
                }
                for(int j=1;j<=temp;j++){
                    System.out.print("*	");
                }
                temp++;
            }
            else if(i==n/2+1){
                for(int j=1;j<=n;j++){
                    System.out.print("*	");
                }
                temp--;
            }
            else{
                
                for(int j=1;j<=space;j++){
                    System.out.print("	");
                }
                for(int j=1;j<=temp;j++){
                    System.out.print("*	");
                }
             temp--;   
            }
            System.out.println();
            
        }
        scn.close();
    }
}
