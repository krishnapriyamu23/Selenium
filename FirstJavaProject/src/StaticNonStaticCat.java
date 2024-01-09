
public class StaticNonStaticCat {

	String name;
	int age;
	int livesRemaining;
	private static int catCount = 0;
	
	public void meow() {
		System.out.println("Meow");
	}
	//constructor is created to increment cat count whenever new cats are added(new objs are created)
	public StaticNonStaticCat() {
		catCount++ ;
	}
//	method is created to return the cat count
	public static int getCatCount() {
		return catCount;
	}
}
