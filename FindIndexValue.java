package string;

public class FindIndexValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="welcome";
		int index = 3;
		char ch[]=s1.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(i==index) {
				System.out.println(ch[i]);
			}
		}
		if(index>s1.length()) {
			System.out.println("out of range");
		}
	}

}
