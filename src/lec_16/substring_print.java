package lec_16;

public class substring_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str= "hello";
        printsubstring(str);
        
	}
	
	public static void printsubstring(String str) {
		for (int i=0;i<str.length();i++) {
			for(int j=i+1;j<=
					str.length();j++) {
				System.out.println(str.substring(i,j)+" ");
			}
		}
		
	}
	

}
