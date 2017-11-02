import java.util.ArrayList;
import java.util.List;

public class code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		solution("1S2D*3T");
	}
	
	  public static int solution(String dartResult) {
	      int answer = 0;
	      String[] arr = dartResult.split("");
	      String[] arrreslt = new String[arr.length];
	      int[] star = {1,1,1,1};

	      for(int i=0; i<arr.length; i++){
	    	  arrreslt[i] = arr[i];
	    	  if(i!=arr.length&&arr[i].equals("1")&&arr[i+1].equals("0")){
    			  arrreslt[i]="10";
    			  i++;
	    	  }
	      }
	      
	      arrreslt = jsremovenull(arrreslt);
	      
	      
	      for(int i=0; i<arrreslt.length; i++){
			if(isStringDouble(arrreslt[i])){	//숫자
				
			}else{
				if(arrreslt[i].equals("S")){
					arrreslt[i-1] = Integer.parseInt(arrreslt[i-1])*1+"";
				}else if(arrreslt[i].equals("D")){
					arrreslt[i-1] = Integer.parseInt(arrreslt[i-1])*Integer.parseInt(arrreslt[i-1])+"";
				}else if(arrreslt[i].equals("T")){
					arrreslt[i-1] = Integer.parseInt(arrreslt[i-1])*Integer.parseInt(arrreslt[i-1])*Integer.parseInt(arrreslt[i-1])+"";
				}else if(arrreslt[i].equals("*")){
					arrreslt[i-2] = Integer.parseInt(arrreslt[i-2])*2+"";
					if(arrreslt.length-1==i){
						star[2] = 2;
					}else if(i<arrreslt.length-1&&i>3){
						star[1] = 2;
					}
				}else if(arrreslt[i].equals("#")){
					arrreslt[i-2] = Integer.parseInt(arrreslt[i-2])*-1+"";
				}
				arrreslt[i] = null;
			}
	      }
	      
	      arrreslt = jsremovenull(arrreslt);

	      
	      for(int i=0; i<arrreslt.length; i++){
				answer = answer+(Integer.parseInt(arrreslt[i])*star[i+1]);

	      }
	      
	      return answer;
	  }
	  
	  
	  public static boolean isStringDouble(String s) {
		    try {
		        Double.parseDouble(s);
		        return true;
		    } catch (NumberFormatException e) {
		        return false;
		    }
	  }
	  

	  public static String[] jsremovenull(String[] array){
	      //array 에서 null 제거
		  int a = 0;
		  for(int i=0; i<array.length; i++){
			  if(array[i]!=null){
				  a++;
			  }
		  }
		  String temp[] = new String[a];
		  int b=0;
		  for(int i=0; i<array.length; i++){
			  if(array[i]!=null){
				  temp[b] = array[i];
				  b++;
			  }
		  }
	      return temp;
	  }

}
