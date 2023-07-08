package FJPLevel1.Patterns;
import java.util.*;
public class Pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int space=0;
        int temp=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("	");
            }
            if(i>1 && i<n/2+1){
                for(int j=1;j<=temp;j++){
                    if(j==1 || j==temp){
                        System.out.print("*	");
                    }else{
                        System.out.print("	");
                    }
                }
            }else{
                for(int j=1;j<=temp;j++){
                    System.out.print("*	");
                }
            }
            if(i<=n/2){
                space++;
                temp-=2;
            }else{
                space--;
                temp+=2;
            }
            System.out.println();
        }
        scn.close();
      }
}
