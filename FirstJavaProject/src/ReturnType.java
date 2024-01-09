
public class ReturnType {

	public static void main(String[] args) {
		
//System.out.println (printName("John", 23));
//		for storing the result value after the return to the variable 'name' and sysout it
		
		String name = printName("Johns", 23);
		System.out.println(name);
	}
	
	public static String printName(String name, int number) {
		return "My name is " + name;
	}

}
