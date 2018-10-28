package Bean;

public class Student {
	private String stuName;
	private int stuNo;
	private String stuPassword;
	protected long stuNumber;
	public Student() {
		
		System.out.println("*******xxx*******");
		
	}
	
	public void test1() {
		System.out.println("--------test1");
	}
	
	private void test2() {
		System.out.println("--------test2");
	}
	
	protected void test3() {
		System.out.println("--------test3");
	}
	public static void test4() {
		System.out.println("--------test4");
	}
	public final static void test5() {
		System.out.println("--------test5");
	}
	public String test6() {
		System.out.println("--------test6");
		return "6";
	}
	public String test7(String name) {
		System.out.println("--------test7");
		return "7";
	}
	
}
