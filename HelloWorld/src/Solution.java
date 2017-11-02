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
class Solution {
	static int Answer;
	static int arr[][];
	static boolean tarr[][];
	static int AN;

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
		//1.testcase
		//2.N by N
		//3.0 or 1 or 2
		
		

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			int N = sc.nextInt();
			arr = new int[N][N];
			tarr = new boolean[N][N];
			AN = N;
			// Answer = 0;
			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
			   Implement your algorithm here.
			   The answer to the case will be stored in variable Answer.
			 */
			/////////////////////////////////////////////////////////////////////////////////////////////
			for(int i=0; i<N; i++){
				String s = sc.next();
				for(int j=0; j<N; j++){
					arr[i][j] = Integer.parseInt(s.charAt(j)+""); //거울 값 저장
					tarr[i][j] = false;
				}
			}
//			System.out.println("tes");
			bang(1,0,0);
			
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					if(tarr[i][j]){
						Answer++;
					} 
				}
			}

			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
	


	public static void bang(int arrow, int i, int j){
		if(i<AN && i>=0 && j<AN && j>=0){
			tarr[i][j]=true;
			if(arr[i][j]==0){
				if(arrow==1){
					bang(arrow,i,j+1);
				}else if(arrow==2){
					bang(arrow,i-1,j);
				}else if(arrow==3){
					bang(arrow,i,j-1);
				}else if(arrow==4){
					bang(arrow,i+1,j);
				}
			}else if(arr[i][j]==1){
				if(arrow==1){
					bang(2,i-1,j);
				}else if(arrow==2){
					bang(1,i,j+1);
				}else if(arrow==3){
					bang(4,i+1,j);
				}else if(arrow==4){
					bang(3,i,j-1);
				}
			}else if(arr[i][j]==2){
				if(arrow==1){
					bang(4,i+1,j);
				}else if(arrow==2){
					bang(3,i,j-1);
				}else if(arrow==3){
					bang(2,i-1,j);
				}else if(arrow==4){
					bang(1,i+1,j);
				}	
			}
		}
	}

}