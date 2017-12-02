
public class Part3 {

	 public boolean twoOccurrences(String stringa, String stringb){
	        int curIndex = 0, count = 0;
	        int l = stringa.length();
	        curIndex = stringb.indexOf(stringa, curIndex);
	        while(true){
	            if(curIndex != -1){
	                count++;
	                if(count == 2){
	                    return true;
	                }
	            }
	            else{
	                return false;
	            }
	            curIndex = stringb.indexOf(stringa, curIndex + l);
	        }
	    }
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
