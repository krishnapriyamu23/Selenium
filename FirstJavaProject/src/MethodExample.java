
public class MethodExample {

	public int accept() {
		String a = "Diwali";
		return a.length();
	}
	public static void main(String[] args) {
      MethodExample obj = new MethodExample();
      int b = obj.accept();
	System.out.println(b);
	}

}
