import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int a = te(0);
		System.out.println(fibo(3));
	}
//	public static int te(int a){
//		if(a==10){
//			System.out.println("end?");
//			return 0;
//		}else{
//			return te(a)+1;
//		}
//	}
	
	public static int fibo(int a){
		if(a!=0){
			a--;
			System.out.println(a); 
			return a+fibo(a);
		}else{
			return a;
		}
	}
}
