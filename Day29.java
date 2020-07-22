import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int max = 0;
            int n = in.nextInt();
            int k = in.nextInt();
            for (int j = 1; j < n-1; j++) {
                for (int z = j+1; z <= n; z++) {
                    int val = j&z;
                    if (val > max && val < k) 
                        max = val;                    
                }    
            }
            System.out.println(max);
        }
    }
}
