package library;

public class AdultUsers implements LibraryUser {

	int age;
	String bookType;
	
	@Override
	public void registerAccount() {
		
		if(age>=12) {
			System.out.println("You have successfully registered under adult account");
			
		}
		else
			System.out.println("not Eligable");
	}

	@Override
	public void requestBook() {

		System.out.println("The book name :"+bookType);
		System.out.println(" you have to return the book in 7 days");
		
	}

}
