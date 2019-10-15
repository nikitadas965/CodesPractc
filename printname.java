
public class printname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Nikita";
		String s[]=str.split("");
		System.out.println(s);
		int length=s.length;
		
		for(int i=0;i<length;i++)
		{
			char temp = str.charAt(i);
			System.out.println(temp);
			
			
		}

	}

}
