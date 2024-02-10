package string;

public class EqualityOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abcd";
		String s2 = "abcd";
		
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		
		int count=0;
		
		if(ch1.length==ch2.length)
		{
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]!=ch2[i]) {
					count++;
					System.out.println("not equal");
					break;
				}
			}
			if(count==0) {
				System.out.println("Equal");
			}
		}
		else
		{
			System.out.println("not equal");
		}
	}

}
