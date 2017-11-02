import java.util.Scanner;

//7
//3 10
//5 20
//1 10
//1 20
//2 15
//4 40
//2 200


public class code14501 {
   static int TEMP = 0;
   static int SUM = 0;
   static int ORI = 0;
   static int MAX = 0;
   static int arr[][];
   static int ori[];
   static int N;
   static int ALL = 0;
   static double time = 0;

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      N = sc.nextInt();
      arr = new int[N][2];
      ori = new int[N];
      
      for(int i=0; i<N; i++){
         arr[i][0] = sc.nextInt();
         arr[i][1] = sc.nextInt();
      }
      
      
//      for(int i=0; i<N; i++){
//         select(i);
//         if(MAX<SUM){
//            MAX = SUM;
//         }
//         System.out.println("SUM : "+SUM);
//         SUM = 0;
//      }
//      select_real(0);
//      selector(0);
//      myselector(0);
      sel(0);
      System.out.println(MAX);
      
      
   }
   
   private static void sel(int start) {	//
      // TODO Auto-generated method stub
	  if(start<N){
		  for(int i=start; i<N; i++){
			  if(i+arr[i][0]<=N){
				  ori[i] = arr[i][1];
					for(int j=0;j<N;j++){
					   SUM = SUM + ori[j];
					}
					if(MAX<SUM){
					   MAX = SUM;
					}
					SUM = 0;
//				  System.out.println("if start: "+start+", i: "+i+", arr: "+arr[i][0]);
				  sel(i+arr[i][0]);
				  ori[i] = 0;
			  }else{
				  for(int j=0;j<N;j++){
					   SUM = SUM + ori[j];
					}
					if(MAX<SUM){
					   MAX = SUM;
					}
					SUM = 0;
//				  System.out.println("else start: "+start+", i: "+i);
			  }
		  }
	  }
   }
   
   
   
   private static void myselector(int start) {
      // TODO Auto-generated method stub
	  if(start<N){
	      for(int i=start;i<N;i++){
	         if(start+arr[i][0]<=N){
	            ori[i] = arr[i][1];

	            myselector(start+arr[i][0]);
	            ori[i] = 0;
	         }else{
	            for(int j=0;j<N;j++){
	               SUM = SUM + ori[j];
	            }
	            if(MAX<SUM){
	               MAX = SUM;
	            }
	            SUM = 0;
	         }
	      }
	  }else{
          for(int j=0;j<N;j++){
              SUM = SUM + ori[j];
           }
           if(MAX<SUM){
              MAX = SUM;
           }
           SUM = 0;
	  }
   }


   private static void selector(int start) {
      // TODO Auto-generated method stub
//      System.out.println("start : "+start);
      for(int i=start;i<N;i++){
         if((start+arr[i][0])<=N){
//            System.out.println(arr[i][1]);
            ori[i] = arr[i][1];
            for(int j=0;j<N;j++){
//               System.out.println(ori[j]);
               SUM = SUM + ori[j];
            }
            if(MAX<SUM){
               MAX = SUM;
               for(int j=0;j<N;j++){
                  System.out.println("ori : "+ori[j]+", i : "+(start+arr[i][0]));
               }
               System.out.println("");
            }
            SUM = 0;
            selector(start+arr[i][0]);
//            System.out.println(i+"," +ori[i]);
            ori[i] = 0;
         }else{
//            System.out.println("else : "+(arr[i][1]));
            for(int j=0;j<N;j++){
               SUM = SUM + ori[j];
//               System.out.println(ori[j]);
//               ori[j] = 0;
            }
            if(MAX<SUM){
               System.out.println(SUM);
//               for(int j=0;j<N;j++){
//                  System.out.println("ori : "+ori[j]);
//               }
               MAX = SUM;
            }
//            System.out.println("");
            SUM = 0;
         }
      }
   }
   
   
   
   
   
   

   private static void select_real(int start) {
      // TODO Auto-generated method stub
//      System.out.println("start : "+start);
//      SUM = TEMP;
//      System.out.println(ORI);
//      if(start<N){
//         ORI = SUM;
         for(int i=start;i<N;i++){
            if((start+arr[i][0])<=N){
               ori[i] = SUM;
               SUM = SUM+arr[i][1];
               if(MAX<SUM){
                  MAX = SUM;
//                  System.out.println(arr[i][1]);
               }
               //System.out.println(", i : "+i+", start : "+start+", arr[i][0] : "+arr[i][0]+", "+ori[i]);
//               System.out.println(start+", "+arr[i][1]);
               select_real(start+arr[i][0]);
//               System.out.println("");
//               SUM = ori[i];
               ori[i] = 0;
//               System.out.println(SUM);
            }else{
               SUM = ori[i];
//               ori[i] = 0;
            }
         }
//      }else{
//      }
   }

   private static void select(int start) {
      // TODO Auto-generated method stub
//      System.out.println(start);//0,3,4,6,8
      if(start<N){
         if(start+arr[start][0]<=N){
            for(int j=start;j<N;j++){
               ALL = ALL+arr[start][1];
               select(start+arr[start][0]);
               System.out.println("ALL : "+ALL);
//               SUM = ALL;
               ALL = 0;
            }
//            SUM = SUM+arr[start][1];
//            select(start+arr[start][0]);
         }
      }
   }

}