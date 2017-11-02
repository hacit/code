/*
You should use the statndard input/output

in order to receive a score properly.

Do not use file input and output

Please be very careful. 
*/

import java.util.Scanner;

/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class code18 {
	static int Answer;

	public static void main(String args[]) throws Exception	{
//		4
//		3 1 1
//		10 -12 10 8
//		-15 -14 -11 11
//		3 1 3
//		10 -12 10 8
//		-15 -14 -11 11
//		5 3 2
//		10 12 9 15 20 17
//		15 -20 24 54 -45 10
//		9 33 32 -89 -37 67
//		54 -34 29 -56 35 24 
//		6 4 3
//		12 23 34 -45 67 -78 89
//		23 -45 78 -34 56 -31 10
//		-54 -87 90 -12 34 54 -65
//		45 -89 23 -45 -77 22 89 
//		34 83 -91 -23 48 56 34
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
			int M = sc.nextInt();
			int N = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[N+1][M+1];
			boolean brr[][] = new boolean[N+1][M+1];
			
			for(int i=0;i<N+1;i++){
				for(int j=0;j<M+1;j++){
					int temp = sc.nextInt();
					if(temp<0){
						temp = temp*-1;
						brr[i][j] = true;
					}
					arr[i][j] = temp;
					System.out.print(arr[i][j] + ", ");
				}
				System.out.println("");
			}
			// Answer = 0;
			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
			   Implement your algorithm here.
			   The answer to the case will be stored in variable Answer.
			 */
			/////////////////////////////////////////////////////////////////////////////////////////////


			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
			

		}
	}
	
	public void cal(){
		
	} 
}