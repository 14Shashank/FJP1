package FJPLevel1.Patterns;
import java.util.*;
public class Pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int space=n/2;
        int temp=1;
        int t1=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("	");
            }
            for(int j=t1;j<=temp;j++){
                System.out.print(j+"	");
            }
            for(int j=temp-1;j>=t1;j--){
                System.out.print(j+"	");
                
            }
            if(i<=n/2){
                space--;
                temp+=2;
                t1++;
            }else{
                space++;
                temp-=2;
                t1--;
            }
            System.out.println();
        }
        
        scn.close();
    }
}
