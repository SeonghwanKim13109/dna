
public class Recursive2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringLenth("i love you"));
		printString("i love you");
	}
	
	public static int stringLenth(String str) {
		if(str.equals(""))
			return 0;
		else
			return 1+stringLenth(str.substring(1));
	}
	
	public static void printString(String str) {
		if(stringLenth(str) == 0) {
			System.out.println();
			return;
		}
		else {
			System.out.print(str.charAt(0));
			printString(str.substring(1));
		}
	}
}
