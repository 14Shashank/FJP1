package FJPLevel1.Patterns;

import java.util.*;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int k=n-1;
        int temp=1;
        for(int i=1;i<=n;i++){
            for(int j=k;j>=1;j--){
                System.out.print("	");
            }
            for(int z=1;z<=temp;z++){
                System.out.print("*	");
            }
            k--;
            temp++;
            System.out.println();

        }scn.close();
    }
}
