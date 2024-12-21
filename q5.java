package test_21_dec;
import java.util.*;
public class q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		
		for(int i = 1; i<n; ++i) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}

}
