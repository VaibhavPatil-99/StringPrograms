package string;

public class ReplaceWithStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "weleome";
		char c1='e';
		char c2='*';
		String s2="";
		
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==c1) {
				s2 = s2+c2;
			}
			else {
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
	}

}
