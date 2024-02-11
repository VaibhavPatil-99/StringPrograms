package string;



public class MaxFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abcaabcb";
		int max=0;
		char ch = '0';
		
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
				if(countCh > max) {
					max = countCh;
					ch = s1.charAt(i);
					}
			
				System.out.println(s1.charAt(i) + " "+countCh);
			}
			}
		//System.out.println(ch+ ":"+max);
		}
	}


