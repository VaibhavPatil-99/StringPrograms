package string;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abcde";
		char ch ='b';
		String s2 = "";
		
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=ch) {
				s2 = s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
	}

}
