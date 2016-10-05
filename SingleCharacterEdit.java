public class SingleCharacterEdit {

    public static String singleCharacterEditWillTurnAIntoB(String a, String b) {
    	//text from String a to array of single characters
    	char[] arrayA = a.toCharArray();
    	char[] arrayB = b.toCharArray();
    	int changes = 0;
    	int index = 0;
    	char charInB = 0;

    	//test1: Replacing one character with another, at some position
    	if(arrayA.length == arrayB.length) {
    		for (int i = 0; i < arrayA.length; i++) { //looping through every character from the string
    			if (arrayA[i] != arrayB[i]) {  //if 
    				if (changes == 0) { 
    					arrayA[i] = arrayB[i];
    					changes++;
    					char c = arrayB[i];
    					charInB = c;
    					index = i;
    				}
    			}
    		}
    		if (changes == 1) {
    			String success = "replace,"+index+","+charInB;
    			return success;
    		}
    		else {
    			return null;
    		}
    	}
    	//test2: Removing a character, from some position
    	else if (arrayA.length == arrayB.length+1) {
	    	for (int i = 0; i < arrayA.length; i++) { //looping through every character from the string
	    		if (i < arrayA.length-1 && arrayA[i] != arrayB[i]) {  
	    			if (changes == 0) {
		    			changes++;
		    			index = i;
	    			}
	   			}
	    		else if (i == arrayA.length-1) {
	    			if (changes == 0) {
		    			changes++;
		    			index = i;
	    			}
	    		}
	    	}
	    	if (changes == 1) {
	    		String success = "remove,"+index;
	   			return success;
	   		}
	   		else {
	   			return null;
    		}			
    	}  	
    	//test 3: Inserting a character at some position, before what was previously there
    	else if (arrayB.length == arrayA.length+1) {
	    	for (int i = 0; i < arrayB.length; i++) { //looping through every character from the string
	    		if (i < arrayB.length-1 && arrayB[i] != arrayA[i]) {  
	    			if (changes == 0) {
		    			changes++;
		    			index = i;
		    			charInB = arrayB[i];
	    			}
	   			}
	    		else if (i == arrayB.length-1) {
	    			if (changes == 0) {
		    			changes++;
		    			index = i;
		    			charInB = arrayB[i];
	    			}
	    		}
	    	}
	    	if (changes == 1) {
	    		String success = "insert,"+index+","+charInB;
	   			return success;
	   		}
	   		else {
	   			return null;
    		}			
    	}
    	else {
    		return null;
    	}
    }
}
