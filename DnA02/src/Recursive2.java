
public class Recursive2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringLenth("i love you"));
	}
	
	public static int stringLenth(String str) {
		if(str.equals(""))
			return 0;
		else
			return 1+stringLenth(str.substring(1));
	}
}
