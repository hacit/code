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
class mirror {
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

			// Answer = 0;
			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
			   Implement your algorithm here.
			   The answer to the case will be stored in variable Answer.
			 */
			/////////////////////////////////////////////////////////////////////////////////////////////
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			boolean[][] ta = new boolean[N][N];

			
			for(int i=0;i<N;i++){
				String s = sc.next();
				for(int j=0;j<N;j++){
					arr[i][j]=Integer.parseInt(s.charAt(j)+"");
					ta[i][j]=false;
				}
			}
			// 0: 
			// 1: /
			// 2: \
			int a = 0;	// y축
			int b = 0;	// x축
			int bang = 1;	//방향
			
			int count = 0;
			while(true){
				count++;
				if(a>=N||b>=N||a<0||b<0){
					break;
				}
				
				if(arr[a][b]==0&&bang==1){
					b++;
				}else if(arr[a][b]==0&&bang==2){
					a--;
				}else if(arr[a][b]==0&&bang==3){
					b--;
				}else if(arr[a][b]==0&&bang==4){
					a++;
				}
				
				if(a>=N||b>=N||a<0||b<0){
					break;
				}
				
				if(arr[a][b]==1&&bang==1){
					ta[a][b] = true;
					a--; bang = 2;
				}else if(arr[a][b]==1&&bang==2){
					ta[a][b] = true;
					b++; bang = 1;
				}else if(arr[a][b]==1&&bang==3){
					ta[a][b] = true;
					a++; bang = 4;
				}else if(arr[a][b]==1&&bang==4){
					ta[a][b] = true;
					b--; bang = 3;
				}
				
				if(a>=N||b>=N||a<0||b<0){
					break;
				}

				if(arr[a][b]==2&&bang==1){
					ta[a][b] = true;
					a++; bang = 4;
				}else if(arr[a][b]==2&&bang==2){
					ta[a][b] = true;
					b--; bang = 3;
				}else if(arr[a][b]==2&&bang==3){
					ta[a][b] = true;
					a--; bang = 2;
				}else if(arr[a][b]==2&&bang==4){
					ta[a][b] = true;
					b++; bang = 1;
				}
			}
			
			System.out.println("count : "+count);
			
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					if(ta[i][j]){
						Answer++;
					}
				}
			}			

			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}