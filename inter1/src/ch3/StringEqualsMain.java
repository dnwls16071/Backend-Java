package ch3;

public class StringEqualsMain {
	public static void main(String[] args) {
		String str1 = new String("hello"); //x001
		String str2 = new String("hello"); //x002
		System.out.println("new String() ==  비교: " + (str1 == str2));
		System.out.println("new String() equals 비교: " + (str1.equals(str2)));

		String str3 = "hello"; //x003
		String str4 = "hello"; //x004
		System.out.println("리터럴 == 비교 : " + (str3 == str4));
		System.out.println("리터럴 equals 비교 : " + (str3.equals(str4)));

		String str5 = "XXX";
		str3 = str5;
		System.out.println("str3 = " + str3);
		System.out.println("str4 = " + str4);
	}
}
