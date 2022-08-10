package Testing;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		super(str);
	}
}
public class Custom {
	static void Validate(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("not eligible to Vote");
		}
		else
			System.out.println("eligible to vote.");
		
	}
	
	public static void main(String[] args) {
		try {
			Validate(15);
		}
		catch(InvalidAgeException e){
			System.out.println("caught exception");
		}
	}
	
}
