import java.util.Scanner;

/*
5
1000000 1000000 1000000 1000000 1000000
5 7
 */


public class code13458 {
   static int N;   //각 시험장 수
   static float A;   //각 응시자 수
   static float B;   //감독이 감독할수 있는 사람 수
   static float C;   //부감도이 감독할 수 있는 사람 수
   static long arr[];
   static long temp[];
   static long MIN = 1000000;
   static long TEMP = 0;
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      N = sc.nextInt();
      arr = new long[N];
      temp = new long[N];
      for(int i=0; i<N;i++){
         arr[i] = (long) sc.nextDouble();
      }
//      A = sc.nextInt();
      B = sc.nextInt();
      C = sc.nextInt();
      
      for(int k=0;k<N;k++){
         if((arr[k]/B)==1){
            temp[k] = 1;
         }else if((arr[k]/B)<1){   //0.x
            temp[k] = (long) (((int)(arr[k]/B))) ;
         }else{   //1.x
            if(((int)(arr[k]/C))<1){   //0.x
               temp[k] = 2;
            }else{   //1.x
               for(long i=0;i<arr[k];i++){
                  if((B+(i*C))>=arr[k]){
                     temp[k] = 1+i;
                     break;
                  }
               }
            }
         }
      }
      
      MIN = 0;
      
      for(int k=0;k<N;k++){
         MIN = MIN+temp[k];
      }
      
      System.out.println(MIN);
      
   }

}