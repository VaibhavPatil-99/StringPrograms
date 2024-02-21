package string_Variation;

public class DelimiterRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "HefShineSoftWarePvtLtdabcd";
		String d ="abcd";
		
		if(s.endsWith(d)) {
			String s1 = s.substring(0,s.length()-d.length());
			System.out.println(s1);
		}
		else {
			System.out.println(s);
				
			}
		}
				
	}


