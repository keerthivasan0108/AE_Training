package String;

public class str2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str2 = "I work with Mpahasis at bangalore";
		StringBuilder sb = new StringBuilder(str2);
		
		int c=0;
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i) == ' ') {
				c++;
			}
		}
		c++;
		System.out.println(str2);
		System.out.println("Number of words : "+c);
	}

}
