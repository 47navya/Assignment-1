package nineteenmarch;
import java.util.*;
public class Busybee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int mn=(a[i]+a[j])/2;
				if(mn>=m) {
					System.out.println("("+a[i]+","+a[j]+")")
;				}
			}
		}
	}
}