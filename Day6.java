import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        for(int i=0;i<t;i++){

            String str = sc.next();
            //Even indices
            for(int j =0;j<str.length();j+=2){
                System.out.print(str.charAt(j));
            }
            System.out.print(" ");
            //Odd indices
            for(int k=1;k<str.length();k+=2){
                System.out.print(str.charAt(k));
            }
            System.out.println();
        }
    }
}
