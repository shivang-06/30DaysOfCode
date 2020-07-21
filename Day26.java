import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int y2 = sc.nextInt();
        int fine;
        if(y1 > y2 ){
            fine = 10000;
        }else if( y1 == y2 && m1 > m2){
            fine = (m1 - m2) * 500;
        }else if(y1 == y2 && m1 == m2 && d1 > d2){
            fine = (d1-d2) * 15;
        }else{
            fine = 0;
        }

        System.out.println(fine);
    }
}
