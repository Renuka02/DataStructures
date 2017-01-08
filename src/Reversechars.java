import java.util.*;
public class Reversechars {

	public static void main(String[] args){
		
		String input="hello world";
		String output= reversechar(input);
		System.out.println(output);
	}
   private static String reversechar(String str){
	   
	   String output=" ";
	  if(str.isEmpty() ||str==null){
		  System.out.println("enter valid string");
		
	  }
	  else{
		  
		for(int i=str.length()-1; i>=0;i--){
			output=output+" "+ str.charAt(i);
			
		}
		
	  }
	return output;
	   
   }
   
}
