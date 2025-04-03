package String;

import java.util.ArrayList;

public class str3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		String str = "I work with Mpahasis at bangalore";
		StringBuilder sb = new StringBuilder(str);
//		String s = "";
//		sb.append(" ");
		int j=0;
		for(int i=0;i<sb.length();i++) {
			
//			if(sb.charAt(i) != ' ') {
//				s = s+sb.charAt(i);
//			}
//			else {
//				al.add(s);
//				s="";
//				
//			}
			if(sb.charAt(i)==' ') {
				al.add(sb.substring(j,i));
				j=i+1;
			}
			if(i==sb.length()-1) {
				al.add(sb.substring(j,i+1));
			}
			else {
				continue;
			}
		}
		System.out.println(al);
		
	}

}
