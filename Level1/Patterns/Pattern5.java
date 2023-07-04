package FJPLevel1.Patterns;
import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int space=n/2;
        int temp=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("	");
            }
            for(int z=1;z<=temp;z++){
                System.out.print("*	");
            }
            if(i<=n/2){
                space--;
                temp+=2;
            }else{
                space++;
                temp-=2;
            }
            
            System.out.println();
        }
        scn.close();
        

    }
}
