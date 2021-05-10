package javaprograms;

public class StringCaseConvertion {

	public static void main(String[] args) {
		
		String s ="jAvA";
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch)) {
				System.out.print(Character.toLowerCase(ch));
			}
			else if(Character.isLowerCase(ch)) {
				System.out.print(Character.toUpperCase(ch));
			}
		}
		
		}

}
