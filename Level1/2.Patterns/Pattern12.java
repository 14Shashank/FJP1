package FJPLevel1.Patterns;
import java.util.*;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+"	");
                int sum=b+a;
                a=b;
                b=sum;
            }

            System.out.println();
        }
        scn.close();
    }
}
