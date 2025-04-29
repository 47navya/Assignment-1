package nineteenmarch;
import java.util.Scanner;
public class chocodis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		System.out.println(findmindiff(a,m));
	}
	public static int findmindiff(int[] a,int m) {
		if(a==null || a.length<m) {
			return -1;
		}
		java.util.Arrays.sort(a);
		int mind=Integer.MAX_VALUE;
		for(int i=0;i<a.length-m;i++) {
			int d=a[i+m-1]-a[i];
			mind=Math.min(mind,d);
		}
		return mind;
	}
}
