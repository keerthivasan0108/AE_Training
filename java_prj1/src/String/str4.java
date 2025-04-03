package String;

public class str4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str4 = "Hi Surya, When are you visiting us";
		StringBuilder sb = new StringBuilder(str4);
		int st=0,end;
		String output = "";
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)==' ') {
				st = i+1;
			}
			if(sb.charAt(i)==',') {
				end = i;
				output = sb.substring(st,end);
			}
		}
		System.out.println(output);
	}

}
