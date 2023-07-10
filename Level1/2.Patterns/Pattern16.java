package FJPLevel1.Patterns;
import java.util.*;
public class Pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int space=(n*2)-3;
        int temp=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=temp;j++){
                System.out.print(j+"	");
            }
            for(int j=1;j<=space;j++){
                System.out.print("	");
            }
            
            for(int j=temp;j>=1;j--){
                if(j<n){
                    System.out.print(j+"	");    
                }
                
            }
            space-=2;
            temp++;
            System.out.println();
        }
         
        scn.close();
     }
}
