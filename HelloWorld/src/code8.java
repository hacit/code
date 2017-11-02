import java.util.Scanner;

public class code8 {

	static int Answer;

	public static void main(String args[]) throws Exception	{
		/*
		   The method below means that the program will read from input.txt, instead of standard(keyboard) input.
		   To test your program, you may save input data in input.txt file,
		   and call below method to read from the file when using nextInt() method.
		   You may remove the comment symbols(//) in the below statement and use it.
		   But before submission, you must remove the freopen function or rewrite comment symbols(//).
		 */		

		/*
		   Make new scanner from standard input System.in, and read data.
		 */
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			int N = sc.nextInt();

			 Answer = 0;
			 int[] ar = new int[N+2];
			 int[] tar = new int[N+2];
			 int[] resultar = new int[N+2];
			 

			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
			   Implement your algorithm here.
			   The answer to the case will be stored in variable Answer.
			 */
			/////////////////////////////////////////////////////////////////////////////////////////////
			for(int i=0;i<N;i++){
				ar[i+1] = sc.nextInt();
				resultar[i+1] = ar[i+1];
			}
			
			while(true){
				
				//init data
				int zerocount = 0;
				System.out.println("");
				for(int i=0;i<N;i++){
					ar[i+1] = resultar[i+1];
					if(ar[i+1]==0){
						zerocount++;	//0의 갯수 세기
					}

					if(ar[i+1]>0){
						tar[i+1] = ar[i+1]-1;
						int min = tar[i+1];
						if(resultar[i]<min){
							min = resultar[i];
						}
						if(resultar[i+2]<min){
							min = resultar[i+2];
						}
						resultar[i+1] = min;
						System.out.print(min+", ");
					}else{
						tar[i+1] = 0;
						resultar[i+1]=0;
					}
					
					
					
//					if(tar[i+1]<1){
//						resultar[i+1]=0;
//					}else{
//						int min = tar[i+1];
//
//						if(resultar[i]<min){
//							min = resultar[i];
//						}
//						if(resultar[i+2]<min){
//							min = resultar[i+2];
//						}
//						resultar[i+1] = min;
//					}

					
				}
				
				//break;
				if((zerocount==N)){
					break;
				}
				Answer++;
				
				//if min
//				for(int i=1;i<N+1;i++){
//					if(tar[i]<1){
//						resultar[i]=0;
//					}else{
//						int min = tar[i];
//
//						if(ar[i-1]<min){
//							min = ar[i-1];
//						}
//						if(ar[i+1]<min){
//							min = ar[i+1];
//						}
//						resultar[i] = min;
//					}
//				}

			}
			

			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
	

}
