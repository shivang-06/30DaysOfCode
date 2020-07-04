import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    Difference(int[] a){
        elements = a;
    }
    
    public void computeDifference(){
        for(int i = 0;i<elements.length;i++){
            for(int j = i+1;j<elements.length;j++){
                   int diff = Math.abs(elements[i] - elements[j]);
                    if(diff > maximumDifference){
                        maximumDifference = diff;
                    }
            }
        }
    }


} // End of Difference class