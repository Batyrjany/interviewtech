
public class Pallindrome {

	public static void main(String[] args) {
	
		String str = "racecar";
		String str1 = "rbcecar";
		
		System.out.println(isPallindrome(str));
		
		System.out.println(Pallindrome(str1));
		
	}
	
	
	
	public static boolean isPallindrome(String str) {

		if(str==null) {
			return false;
		}
		StringBuilder sb = new StringBuilder(str);
		
		return sb.reverse().toString().equals(str);
	}
	public static boolean Pallindrome(String str) {

		int init =0;
		int end = str.length()-1;
		
		while(init<end) {
		if(str.charAt(init)!=str.charAt(end)) {
			return false;
		}
		
		init++;
		end--;
		}
		
		
		return true;
	}
	
	
	

}
