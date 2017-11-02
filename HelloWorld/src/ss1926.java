import java.util.Scanner;

public class ss1926 {
	static int T;
	static int NN;
	static int arr[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		T = sc.nextInt();
		NN = sc.nextInt();
		
		for(int i=1;i<=NN;i++){
			if(i==1000){
				System.out.print(i);
			}else{
				//
				arr = new int[3];
//				arr[0] = i/100;		//100의 자리
//				arr[1] = i/10;		//10의자리
//				arr[2] = i%100;		//1의자리
				int N = 0;
				if(i>=0&&i<10){
					N=1;
					arr[0] = i;
				}else if(i>=10&&i<100){
					N=2;
					arr[1] = i%10;
					arr[0] = i/10;
				}else if(i>=100&&i<1000){
					N=3;
					arr[2] = (i%100)%10;
					arr[1] = (i%100)/10;
					arr[0] = i/100;
				}
				String ot = "";
				int state = 0;
				boolean flag = true;
				
				for(int j=0;j<N;j++){
					if(arr[j]==3||arr[j]==6||arr[j]==9){
						ot = ot+"-";
						flag = false;
					}else{
						ot = ot + arr[j];
					}
				}
				if(ot.equals("--")||ot.equals("--=")){
					System.out.print(ot);
				}else{
					if(!flag){
						System.out.print("-");
					}else{
						System.out.print(ot);
					}
				}
				
				if(i!=(NN)){
					System.out.print(" ");
				}else{
				}
			}
		}
		
		
//		for(int t=0;t<T;t++){
//			arr = new int[10];
//			int MAX = 0;
//			for(int i=0;i<10;i++){
//				arr[i] = sc.nextInt();
//			}
//			for(int i=0;i<10;i++){
//				if(arr[i]%2==1){
//					MAX = MAX+arr[i];
//				}
//			}			
//			
//			System.out.println("#"+(t+1)+" "+MAX);
//		}
	}

}

