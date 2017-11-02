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
class prac16 {
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

//			 Answer = 0;
			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
			   Implement your algorithm here.
			   The answer to the case will be stored in variable Answer.
			 */
			/////////////////////////////////////////////////////////////////////////////////////////////
			long[] arr = new long[N];
			long[] arr_minor = new long[N];
			long temp = 999999999;
			//최소값찾기
			for(int i= 0;i<N;i++){
				arr[i] = sc.nextLong();
				if(i>0){
					arr_minor[i-1] = arr[i]-arr[i-1];
					if(temp>arr[i]-arr[i-1]){
						temp = arr[i]-arr[i-1];
					}
				}
				
			}
			
			Answer = 1;
			
			for(int a=1; a<=(temp)/2; a++){
				if(temp%a==0){
					Answer++;
				}
			}

			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}