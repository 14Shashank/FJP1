package FJPLevel1.Patterns;
import java.util.*;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int temp=n;
        int space=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("	");
            }
            for(int z=1;z<=temp;z++){
                System.out.print("*	");
            }
            space++;
            temp--;
            System.out.println();
        }scn.close();

    }
}
