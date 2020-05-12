package Package1;
// Access Modifiers
// Private - within class
// Default - it is not a keyword - within package (friend classes)
// Protected - within and outside package through inheritance only
// Public - anywhere within the project

public class A {
	
	private int x;
	public int y = x + 1;
	public int f = 10;
	protected String cheatCode = "abcd";

	protected void print() {
		System.out.println(x);
		System.out.println(y);
	}
	
}

class AA{
	public int m;
	public int n;
}
