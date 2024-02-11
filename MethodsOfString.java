package string;

public class MethodsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "welcome";
		String s2 = new String("hello");
		
		StringBuffer s3= new StringBuffer("hefshine");
		s3.append("soft");
		System.out.println(s3);
		
		s3.replace(1, 3, "*");
		System.out.println(s3);
		
		s3.delete(0, 4);
		System.out.println(s3);
		
		s3.insert(0, '@');
		System.out.println(s3);
		
		String s ="m";
		int in = s3.lastIndexOf(s,11);
		System.out.println(in);
	}

}
