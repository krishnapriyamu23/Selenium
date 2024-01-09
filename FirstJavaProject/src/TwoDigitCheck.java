
public class TwoDigitCheck {

	public static void main(String[] args) {
		System.out.println(checkNum(8));

	}
	
	public static boolean checkNum(int x) {
		if(x>9 && x<100) {
			return true;
		}
		else {
			return false;
		}
	}

}
