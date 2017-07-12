package wxs.medium.triangle_count;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * @param S: A list of integers
     * @return: An integer
     */
    public int triangleCount(int S[]) {
    	List<List<Integer>> triangleList = new ArrayList<List<Integer>>(); 
    	int result = 0;
    	int[] sortedList = this.listSort(S);
    	for (int i = 0; i < sortedList.length - 2; i++) {
    		for (int j = i; j < sortedList.length - 1; j++) {
    			for (int h = j; h < sortedList.length; h++) {
        			if (sortedList[i] + sortedList[j] > sortedList[h]) {
        				List<Integer> triangle = new ArrayList<Integer>();
        				triangle.add(sortedList[i]);
        				triangle.add(sortedList[j]);
        				triangle.add(sortedList[h]);
        				triangleList.add(triangle);
        				result++;
        			} else {
        				continue;
        			}
    			}
    		}
    	}
    	
    	for (int i = 0; i < triangleList.size(); i++) {
    		System.out.print("[");
    		for (int j = 0; j < triangleList.get(i).size(); j++) {
    			System.out.print(triangleList.get(i).get(j));
    			if (j < triangleList.get(i).size() - 1) {
    				System.out.print(" ");
    			}
    		}
    		System.out.print("]\n");
    	}
		return result;
    }
    
    public int[] listSort(int S[]) {
    	for (int i = 0; i < S.length - 1; i++) {
    		for (int j = i; j < S.length; j++) {
    			if (S[j] < S[i]) {
    				int temp = S[i];
    				S[i] = S[j];
    				S[j] = temp;
    			}
    		}
    	}
		return S;
    	
    }
    
//    public boolean isTriangle(Integer a, Integer b, Integer c) {
//    	boolean isT = false;
//    	Integer r1 = a + b;
//    	Integer r2 = a + c;
//    	Integer r3 = b + c;
//    	if (a < r1 && 
//    			a < r2 && 
//    			a < r3 && 
//    			b < r1 && 
//    			b < r2 && 
//    			b < r3 && 
//    			c < r1 && 
//    			c < r2 && 
//    			c < r3) {
//    		isT = true;
//    	}
//    	return isT;
//    }
}
