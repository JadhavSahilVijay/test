package test_21_dec;
import java.util.*;
public class q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if(a>b && a>c && a>d) {
			System.out.println(a+" is largest");
		}else if(b>c && b>d){
			System.out.println(b+" is largest");
		}else if(c>d) {
			System.out.println(c+" is largest");
		}else {
			System.out.println(d+" is largest");
		}
	}

}
