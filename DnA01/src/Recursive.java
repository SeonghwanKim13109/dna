
public class Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func(4);
	}
	public static void func(int i) {
		if(i<=0)
			return;
		System.out.println("Hello World");
		func(i-1);
	}
}
