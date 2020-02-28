package arrayPractice;

import java.util.Scanner;

public class SubarrayWithGivenSum {
	
	public static void main(String s[]) {
		Scanner scan = new Scanner(System.in);
		int t =scan.nextInt();
		while(t>0) {
			int n=scan.nextInt();
			int sum=scan.nextInt();
			int [] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=scan.nextInt();
			}
			//int arr[] = {135,101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28 ,37 ,192, 5 ,103 ,154 ,93 ,183 ,22 ,117 ,119 ,96 ,48 ,127 ,172 ,139 ,70 ,113 ,68 ,100 ,36 ,95 ,104 ,12, 123, 134};
			subArray(arr, sum);
			t--;
		}
	}
	public static void subArray(int a[], int sum) {
			int header=0;
			int csum=0;
			boolean flag=false;
			for(int i=0;i<a.length;i++) {
				csum+=a[i];
				while(csum>sum) {
					csum-=a[header];
					header++;
				}
				if(csum==sum) {
					flag=true;
					System.out.println("subarray from "+header+" to "+i);
					break;
				}
			}
			if(!flag) {
				System.out.println(-1);
			}
	}

}
