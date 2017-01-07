
public class ReverseString {
	public static void main(String args[]){
		String str="This is a string";
		String output=reverse(str);
		//reverse(str);
		System.out.print(output);
	}
	  static String reverse(String str){
		String output=" ";
		
		if(str.length()<=1){
			return str;
		}
		else{
			String[] orgarray=str.split("\\s+");
			for(String xyz: orgarray){
				output = xyz+" "+output;
				//System.out.print(output);
			}
		}
		return output;
		
	}
}

