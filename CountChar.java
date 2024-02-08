package string;

// check frequency of characters

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abcaba";
		
		for(int i=0;i<s1.length();i++) {
			int cnt=0;
			for(int j=0;j<i;j++) {
				if(s1.charAt(i)==s1.charAt(j)) {
					cnt++;
					break;
				}
			}
			if(cnt==0) {
				int countCh=0;
				for(int j=0;j<s1.length();j++) {
					if(s1.charAt(i)==s1.charAt(j)) {
						countCh++;
					}
				}
			
				System.out.println(s1.charAt(i) + " "+countCh);
			}
			}
		}
	}


