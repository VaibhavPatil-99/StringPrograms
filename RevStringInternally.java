package string;

public class RevStringInternally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hello i am a good boy";
		String [] s2 = s1.split(" ");
		
		for(int i=0;i<s2.length;i++) {
			String temp = s2[i];
			
			char[] ca = temp.toCharArray();
			int start=0;
			int end = ca.length-1;
			
		    while(start<end) {
		    	char ch = ca[start];
		    	ca[start] = ca[end];
		    	ca[end]=ch;
		    	
		    	start++;
		    	end--;
		    }
		    String s3 = new String(ca);
		    s2[i]=s3;
		}
		String mainStr = "";
		for(int i=0;i<s2.length;i++) {
			mainStr = mainStr+s2[i] + " ";	
		}
		System.out.println(mainStr);
	}

}
