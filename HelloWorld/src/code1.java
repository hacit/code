
public class code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {46, 33, 33, 22, 31, 50};
		int arr2[] = {27, 56, 19, 14, 14, 10};
		solution(6, arr1, arr2);
	}
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		int[][] arrresult = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=(arr1.length-1);j>=0;j--){
	    		if((arr1[i]%2==1)||(arr2[i]%2==1)){
	    			arrresult[i][j] = 1;
	    		}else{
	    			arrresult[i][j] = 0;
	    		}
	    		arr1[i] = arr1[i]/2;
	    		arr2[i] = arr2[i]/2;
	    	}
	    }

	    for(int i=0;i<n;i++){
    		StringBuilder sb = new StringBuilder("");
	    	for(int j=0;j<n;j++){
	    		if(arrresult[i][j]==1){
	    			sb.append("#");
	    		}else{
	    			sb.append(" ");
	    		}
	    	}
	    	answer[i] = sb.toString();
	    }
	    return answer;
	}
}
