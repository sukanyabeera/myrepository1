package Strings;

//Not working exactly
class Capitals{
	
	public boolean detectCapitalUse(String word) {
        
	       int n=word.length();
	        if(word.equals(word.toUpperCase())){
	        	System.out.println("true");
	        	
	            return true;
	        }
	        for(int i=1;i<n;i++){
	            if(word.charAt(i)<='A' && word.charAt(i)>='Z'){
	                return false;
	            }
	        }
	        System.out.println("false");
	        return false;
	          
	    }
}

public class RightUsageOfCapitals {

	public static void main(String args[]) {
		Capitals caps=new Capitals();
		
		caps.detectCapitalUse("hgjTTT");
		
	}

	
}
