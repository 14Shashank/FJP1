package FJPLevel1.GettingStarted;

import java.util.*;
public class GradingSystem {
    public static void main(String[] args) {
        // input - don't change this code
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
        if(marks>90){
            System.out.print("excellent");
        }else if(marks>80 && marks<=90){
            System.out.print("good");
        }else if(marks>70 && marks<=80){
            System.out.print("fair");
        }else if(marks>60 && marks<=70){
            System.out.print("meets expectations");
        }else{
            System.out.print("below par");
        }
        scn.close();
     }
}
