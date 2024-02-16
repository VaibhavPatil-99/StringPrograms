package string;

public class StringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="welcome";
		char ch[]=new char[s1.length()];
		
		for(int i=0;i<ch.length;i++) {
			ch[i]=s1.charAt(i);
		}
		for(int i=0;i<ch.length;i++) {
			System.out.println(i+ ": "+ ch[i]);
		}
	}

}
