package string_Variation;

public class SwapNibbles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 100;
		String s = Integer.toBinaryString(n);
		
		while(s.length()<8) {
			s = 0+s;
			
			String part1 = s.substring(0,4);
			String part2 = s.substring(4);
			
			s = part2+part1;
			
			int num = Integer.parseInt(s, 2);
			System.out.println(num);
		}
	}

}
