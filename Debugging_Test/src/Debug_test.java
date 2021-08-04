

public class Debug_test {
	
	public static void main(String[] args)
	{   System.out.println("start");
		int a=10;
		show();
		a=a++ + ++a - ++a + a++;
		if(a>55) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}System.out.println("Done");
	}
	

public static void show() {
	System.out.println("2nd method");
}
	
}
