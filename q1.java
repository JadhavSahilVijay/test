package test_21_dec;
import java.util.*;
public class q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int evenIndex = 0;
		int oddIndex = 0;
		int a[]=new int[n];
		int even[] = new int[n];
		int odd[]=new int[n];
		System.out.println("enter elements");
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i<n; i++) {
			if(a[i]%2==0) {
				even[evenIndex] = a[i];
				evenIndex++;
			}else {
				odd[oddIndex] = a[i];
				oddIndex++;
			}
		}
		System.out.println("even array is ");
		for(int i = 0; i<even.length; i++) {
			System.out.println(even[i]);
		}
		System.out.println("odd array is ");
		for(int i = 0; i<odd.length; i++) {
			System.out.println(odd[i]);
		}
	}

}
