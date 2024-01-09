
public class SimpleConditional {

	public static void main(String[] args) {
//		System.out.printName("JOhn");
		printName("John");

	}
	public static void printName(String name) {
		if(name.equals("John")){
			System.out.println("This guy is Awesome");
		}
		else if(name.equals("Larry")){
			System.out.println("This guy is OK");
		}
		else {
			System.out.println("I dont know this guy");
		}
	}
}
