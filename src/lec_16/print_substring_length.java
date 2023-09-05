package lec_16;

public class print_substring_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str ="hello";
     printsubstring(str);
     
	}
	public static void printsubstring(String str) {
		
		for(int len=1;len<=str.length();len++) {
			for(int j=len;j<=str.length();j++) {
				int i=j-len;
				System.out.println(str.substring(i,j));
			}
			
		}
		
	}

}
