package constructors;
class Furniture{
	int lenght;
	int height;
	int size;
	// constructor overloading 
	Furniture(int size){
		this(size,size); 
	}
	Furniture(int length , int height){
		this.lenght=lenght;
		this.height=height;
		System.out.println("Size of the furniture is "+length+"X"+height);
	}
}
class Desk extends Furniture{
	int lenght;
	int height;
	int size;
	Desk(int size) {
		super(size);          //super() to call parent constructor
	}     
}
public class Customers {
	public static void main(String[] args) {
		Furniture furni=new Furniture(50,30);
	furni=new Desk(30);
		
	}

}
