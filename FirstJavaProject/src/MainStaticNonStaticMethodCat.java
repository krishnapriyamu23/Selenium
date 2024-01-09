
public class MainStaticNonStaticMethodCat {

	public static void main(String[] args) {
		System.out.println(StaticNonStaticCat.getCatCount());
		StaticNonStaticCat myCat = new StaticNonStaticCat();
		myCat.meow();
		myCat.name = "Stella";
		myCat. age = 7;

		System.out.println(StaticNonStaticCat.getCatCount());
	}

}
