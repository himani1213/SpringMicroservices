package arrayPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine());
			int [] arr=new int[n];
			String str=br.readLine();
			String[] s = str.trim().split("\\s+");
			for(int i=0;i<n;i++) {
				arr[i]=Integer.parseInt(s[i]);
			}
		//int arr[] = {0,1,0,2,0,2};
			int counter0 =0, counter1 =0, counter2 = 0;
			int newArr[] = new int[arr.length];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==counter0)
					counter0++;
				else if(arr[i]==counter1)
					counter1++;
				else
					counter2++;
			}
			
			for(int i=0;i<counter0;i++) {
				newArr[i]=0;
				System.out.print(0+" ");
			}
			for(int i=0;i<counter1;i++) {
				newArr[i]=1;
				System.out.print(1+" ");
			}
			for(int i=0;i<counter2;i++) {
				newArr[i]=2;
				System.out.print(2+" ");
			}	
	}
		

	}

}
