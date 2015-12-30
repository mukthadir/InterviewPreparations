import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Solution {
	public static void main(String args[]) throws Exception{
		
		int[] f = {1,2,2,2,3,4,2,3,2,5};
		int[] m = {2,3,2,2,2,2,4,5};
		int[] o = new int[100];
		int count = 0;
		
		for (int i = 0; i< f.length;i++) { 
			for (int j = 0; j<m.length; j++){
				if(f[i] == m[j] && f[i] != 0 && m[j] != 0) {
					o[count] = f[i];
					count++;
					f[i] = 0;
					m[j] = 0;
				}
			}
		}
		

		
		
		int[] outputArray = new int[count];
		int counter = 0;
		
		for (int i=0; i<count;i++) {
//			if(o[i] != 0) {
				outputArray[counter] = o[i];
				counter++;
//			}
		}
		
		int temp;
		for(int i=0; i < outputArray.length-1; i++){
            for(int j=1; j < outputArray.length-i; j++){
                if(outputArray[j-1] < outputArray[j]){
                    temp=outputArray[j-1];
                    outputArray[j-1] = outputArray[j];
                    outputArray[j] = temp;
                }
            }
		}
		
		for(int i = 0; i<outputArray.length; i++) {
			System.out.println(outputArray[i]);
		}
	}
}
