package string;

public class ImplementCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abcd";
		String s2 = "abc";
		int i=0;
		int count=0;
		
		while(i<s1.length() && i<s2.length()) {
			if(s1.charAt(i) == s2.charAt(i)) {
				count++;
			}
			else {
				System.out.println(s1.charAt(i) - s2.charAt(i));
				break;
			}
			i++;
		}
		if(count==s1.length() || count==s2.length()) {
			System.out.println(s1.length()-s2.length());
		}
	}

}
