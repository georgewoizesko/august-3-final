package com.helloClass;

public class WorkingWithRandom {

	
//THIS IS THE BEGINING OF A METHOD  vvvvvvv
	public static void main(String[] args) {
		
		boolean doWeHaveAllTheNotebooks = true;
		
		//Went to count the books and found one missing thus
		
		doWeHaveAllTheNotebooks = false;
		
		
		String whatHappened = notebook(doWeHaveAllTheNotebooks);
		
		System.out.println(whatHappened);
		
		String doThisNext = whatHappened + " Do you know where the book is?";
		
		System.out.println(doThisNext);

	}
//THIS IS THE END OF A METHOD ^^^^^^
	
//THIS IS THE BEGINING OF A METHOD vvvvvvvvv
	public static String notebook(boolean isLost) {
			
		String whatToDoNow = null;
		
		if (isLost) {
			whatToDoNow = "Good, we have all the books.";
			
		}else{
			whatToDoNow = "Ask the Students";
					
		}
		
		return whatToDoNow;
}
//THIS IS THE END OF A METHOD ^^^^^^^^^^
}