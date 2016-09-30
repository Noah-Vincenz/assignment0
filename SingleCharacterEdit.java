public class SingleCharacterEdit {

    public static String singleCharacterEditWillTurnAIntoB(String a, String b) {
    	String[] arrayA = a.split(""); //text from String a to array of single characters ------ change to char
    	String[] arrayB = b.split("");
    	
    	int changes = 0;
    	int index = 0;
    	String charInB = null;

    	//test1
    	if(arrayA.length == arrayB.length) {
    		for (int i = 0; i < arrayA.length; i++) { //looping through every character from the string
    			if (!arrayA[i].equals(arrayB[i])) {  
    				if (changes == 0) {
    					arrayA[i] = arrayB[i];
    					changes++;
    					String str = arrayB[i];
    					charInB = str;
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
    	//test2: remove char from A anywhere
    	else if (arrayA.length == arrayB.length+1) {
	    	for (int i = 0; i < arrayA.length; i++) { //looping through every character from the string
	    		if (i < arrayA.length-1 && !arrayA[i].equals(arrayB[i])) {  
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
	    		if (i < arrayB.length-1 && !arrayB[i].equals(arrayA[i])) {  
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
