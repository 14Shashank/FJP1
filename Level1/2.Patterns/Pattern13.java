package FJPLevel1.Patterns;
import java.util.*;
public class Pattern13 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            int val=1;
            for(int j=0;j<=i;j++){
                System.out.print(val+"	");
                val=val*(i-j)/(j+1);
            }
            System.out.println();
        }
        scn.close();
    }
}
