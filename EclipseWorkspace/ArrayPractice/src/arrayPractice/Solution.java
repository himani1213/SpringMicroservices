package arrayPractice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	 public static int solution(int[] k) {
	        // write your code in Java SE 8
		 int A[] = {2,2,2,2,2,3,3,4,4,6};
		 int n = A.length;
	        int[] L = new int[n + 1];
	        L[0] = -1;
	        for (int i = 0; i < n; i++) {
	            L[i + 1] = A[i];
	        }
	        int count = 0;
	        int pos = Math.round((n + 1) / 2);
	for(int j=1;j<=n;j++){
	 int candidate = L[j];
	        for (int i = j+1; i <= n; i++) {
	            if (L[i] == candidate)
	                count = count + 1;
	        }
	System.out.print(pos);
	 if (count > pos)
	            return candidate;
	}
	       
	       
	        return (-1);
	/*HashMap<String,String> map = new HashMap<>();
	String out ="";
	for(int i=0;i<A.length;i++) {
	String[] op = A[i].split(":");
	if(op[0].equals("i")) {
	System.out.println(map.put(op[1],op[2]));
	}
	else if(op[0].equals("j")){
	out+=map.get(op[1])+" ";
	}
	else if(op[0].equals("k")){
	out+=""+map.size()+" ";
	}
	else if(op[0].equals("l")){
	map.remove(op[1]);
	}
	}
	System.out.println(out);
	return out;*/
	 }
    public static void main(String args[] ) throws Exception {
    	solution(new int[10]);
    	/*String[] array = new String[] {"i:1:2", "i:66:3", "j:66", "l:1", "k"};
    	System.out.println(solution(array));*/
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
       /* Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("jhgjvhhv");
        while(sc.hasNext()) {
            sb.append(sc.next());
        }
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<sb.length();i++) {
            Character key = sb.charAt(i);
            if(!key.equals(" ")) {
            if(hm.containsKey(key)) {
                hm.put(key, hm.get(key)+1);
            } else {
                hm.put(key, 1);
            }
            }
        }
        int count =0;
        for(Map.Entry mapElement : hm.entrySet()) {
            if(mapElement.getValue().equals(2)) {
                count++;
                System.out.print(mapElement.getKey()+" ");
            } 
        }
        if(count==0) {
            System.out.print(" No Duplicate");
        }
 */   }
}