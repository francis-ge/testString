package testString;

public class testStringEquals {
	
	public void testStringEquals1(){
		String str1 = "abc";
		String str2 = "def";
		String str3 = "abc";
		System.out.println(str1==str2);
	}
	
	public static void main(String[] args) {
		testStringEquals testMethod = new testStringEquals();
		testMethod.testStringEquals1();
	}
}
