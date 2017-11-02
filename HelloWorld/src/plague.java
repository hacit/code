import java.util.Scanner;

//6 6
//0 0 0 0 0 0
//0 0 0 0 0 0
//0 0 0 0 0 0
//0 0 0 0 0 0
//2 1 0 0 0 0
//2 1 0 0 0 0


public class plague {

   static int arr[][];
   static int wallarr[][];
   static int N;
   static int M;
   static int temparr[][];
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      N = sc.nextInt();
      M = sc.nextInt();
      arr = new int[N][M];
      temparr = new int[N][M];
      wallarr = new int[N*M][2];
      int wallnum = 0;
      int maxcount = 0;
      int MAX = 0;
      
      for(int i=0; i<N; i++){
         for(int j=0; j<M; j++){
            int temp = sc.nextInt();
            arr[i][j] = temp;
            if(temp==0){   //벽체크
               wallarr[wallnum][0] = i;
               wallarr[wallnum][1] = j;
               wallnum++;
            }
         }
      }
      
//      for(int i=0; i<N; i++){
//         for(int j=0; j<M; j++){
//            if(arr[i][j]==2){
//               spread(i,j);
//            }
//         }
//      }

//      0 0 1 0
//      0 0 0 0
      
//      00 01 03, 00 01 04, 00 01 15 

      for(int a=0; a<wallnum; a++){
    	 arr[wallarr[a][0]][wallarr[a][1]] = 1;
         for(int b=a+1; b<wallnum; b++){
        	 arr[wallarr[b][0]][wallarr[b][1]] = 1;
             for(int c=b+1; c<wallnum; c++){
            	 arr[wallarr[c][0]][wallarr[c][1]] = 1;
            	 //spread
//            	 temparr = arr;
//         		System.arraycopy(arr, 0, temparr, 0, arr.length);
            	 for(int i=0; i<N; i++){
		             for(int j=0; j<M; j++){
		            	 temparr[i][j] = arr[i][j];
		             }
		         }
            	 
            	 
	             for(int i=0; i<N; i++){
		             for(int j=0; j<M; j++){
		                if(arr[i][j]==2){
		                	spread(i,j);
		                }
		             }
		         }
	             
	           for(int i=0; i<N; i++){
		           for(int j=0; j<M; j++){
		        	   if(arr[i][j]==0){
		        		   maxcount++;
		        	   }
		           }
		        }

	             
	           if(maxcount>MAX){
	        	   MAX = maxcount;
	           }
	           maxcount = 0;
	           
	           
	           for(int i=0; i<N; i++){
		             for(int j=0; j<M; j++){
		            	 arr[i][j] = temparr[i][j];
		             }
		         }
//	             arr = temparr;
//	             System.arraycopy(temparr, 0, arr, 0, temparr.length);
	             //spread
            	 arr[wallarr[c][0]][wallarr[c][1]] = 0;
             }
             arr[wallarr[b][0]][wallarr[b][1]] = 0;
         }
         arr[wallarr[a][0]][wallarr[a][1]] = 0;
      }
      
//      for(int i=0; i<N; i++){
//         for(int j=i+1; j<M; j++){
//            for(int k=j+1; k<M; k++){
//               arr[j][k] = 1;
//            }
//         }
//      }
      
      
//      for(int i=0; i<N; i++){
//         for(int j=0; j<M; j++){
//            System.out.print(arr[i][j]+", ");
//         }
//         System.out.println("");
//      }
      System.out.println(MAX);
      
   }

   private static void spread(int i, int j) {
      // TODO Auto-generated method stub
      if(i>0&&j>0&&i<N-1&&j<M-1){ 
         if(arr[i-1][j]==0){   arr[i-1][j] = 2; spread(i-1,j);}
         if(arr[i+1][j]==0){   arr[i+1][j] = 2; spread(i+1,j);}
         if(arr[i][j-1]==0){   arr[i][j-1] = 2; spread(i,j-1);}
         if(arr[i][j+1]==0){   arr[i][j+1] = 2; spread(i,j+1);}
      }else if(i==0&&j==0){
         if(arr[i+1][j]==0){   arr[i+1][j] = 2; spread(i+1,j);}
         if(arr[i][j+1]==0){   arr[i][j+1] = 2; spread(i,j+1);}
      }else if(i==N-1&&j==M-1){
         if(arr[i-1][j]==0){   arr[i-1][j] = 2; spread(i-1,j);}
         if(arr[i][j-1]==0){   arr[i][j-1] = 2; spread(i,j-1);}
      }else if(i==0&&j==M-1){
         if(arr[i+1][j]==0){   arr[i+1][j] = 2; spread(i+1,j);}
         if(arr[i][j-1]==0){   arr[i][j-1] = 2; spread(i,j-1);}
      }else if(i==N-1&&j==0){
         if(arr[i-1][j]==0){   arr[i-1][j] = 2; spread(i-1,j);}
         if(arr[i][j+1]==0){   arr[i][j+1] = 2; spread(i,j+1);}
      }else if(i==0){
         if(arr[i+1][j]==0){   arr[i+1][j] = 2; spread(i+1,j);}
         if(arr[i][j-1]==0){   arr[i][j-1] = 2; spread(i,j-1);}
         if(arr[i][j+1]==0){   arr[i][j+1] = 2; spread(i,j+1);}
      }else if(j==0){
         if(arr[i-1][j]==0){   arr[i-1][j] = 2; spread(i-1,j);}
         if(arr[i+1][j]==0){   arr[i+1][j] = 2; spread(i+1,j);}
         if(arr[i][j+1]==0){   arr[i][j+1] = 2; spread(i,j+1);}
      }else if(i==N-1){
         if(arr[i-1][j]==0){   arr[i-1][j] = 2; spread(i-1,j);}
         if(arr[i][j-1]==0){   arr[i][j-1] = 2; spread(i,j-1);}
         if(arr[i][j+1]==0){   arr[i][j+1] = 2; spread(i,j+1);}
      }else if(j==M-1){
         if(arr[i-1][j]==0){   arr[i-1][j] = 2; spread(i-1,j);}
         if(arr[i+1][j]==0){   arr[i+1][j] = 2; spread(i+1,j);}
         if(arr[i][j-1]==0){   arr[i][j-1] = 2; spread(i,j-1);}
      }
   }

}

