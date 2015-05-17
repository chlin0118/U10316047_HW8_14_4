public class TestLoanWithException{
	 public static void main(String[] args) {
		 
		try{
			//Create a LoanWithException object
			LoanWithException loan1 = new LoanWithException(5,5,-5);
		}
		catch(IllegalArgumentException ex){
			//Print ex.toString() about the exception
			System.out.println(ex);
		}
	}
}



