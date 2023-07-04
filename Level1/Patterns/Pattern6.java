package FJPLevel1.Patterns;
import java.util.*;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int space=1;
        int temp=n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=temp;j++){
                System.out.print("*	");
            }
            for(int j=1;j<=space;j++){
                System.out.print("	");
            }
            for(int j=1;j<=temp;j++){
                System.out.print("*	");
            }
            if(i<=n/2){
                space+=2;
                temp--;
            }else{
                temp++;
                space-=2;
            }
            System.out.println();
        }
        scn.close();

    }
}
