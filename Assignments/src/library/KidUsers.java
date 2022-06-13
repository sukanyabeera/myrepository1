package library;

public class KidUsers implements LibraryUser {

	int age;
	String bookType;
	

	@Override
	public void registerAccount() {

		if(age<12) {
			System.out.println("You have successfully registered under  Kids Account");
				}
		else
			System.out.println("not eligable");
	}

	@Override
	public void requestBook() {
		System.out.println("The book name :"+bookType);
		System.out.println(" you have to return the book in 10 days");
		
		
	}

}
