package string;

// Remove spaces

public class Trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "   computer  ";
		
		//System.out.println(s1.trim());
		
		int start = 0;
		int end =s1.length()-1;
		
		while(true)
		{
			if(s1.charAt(start) == ' ') 
			{
				start++;
			}
			else 
			{
				break;
			}
		}
		
		while(true) 
		{
			if(s1.charAt(end) == ' ') 
			{
				end--;
			}
			else
			{
				break;
			}
		}
//		System.out.println("start : "+start);
//		System.out.println("end : "+end);
		
		for(int i=start;i<=end;i++) 
		{
			System.out.print(s1.charAt(i));
		}
		
		
	}

}
