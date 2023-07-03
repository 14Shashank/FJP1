package FJPLevel1.GettingStarted;
import java.util.*;
public class InverseOfNum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int sum=0;
        int c=1;
        while(n>0){
            int r=n%10;
            sum=sum+c*(int)Math.pow(10,r-1);
            c++;
            n=n/10;
        }
        System.out.println(sum);

        
        scn.close();
       }
}



// The inverse of a number is defined as the number created by interchanging the face value and index of digits of number
//e.g.for 426135(reading from right to left, 5 is in place 1, 3 is in place 2, 1 is in place 3, 6 is in place 4, 2 is in place 5 
//and 4 is in place 6), the inverse will be 416253 (reading from right to left, 3 is in place 1, 5 is in place 2,2 is in place 3,
//6 is in place 4, 1 is in place 5 and 4 is in place 6) More examples - inverse of 2134 is 1243 and inverse of 24153 is 24153    