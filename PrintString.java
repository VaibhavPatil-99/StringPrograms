package string;

public class PrintString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "welcome";
		int count=0;
		
		for(int i=0;i<s1.length();i++) {
			System.out.print(s1.charAt(i));
			count++;
		}
		System.out.println(count);
	}

}
