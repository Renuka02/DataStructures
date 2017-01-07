import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateValues {

	public static void main(String[] args) {
		
		duplicate("programmming");
		
	}
	 public static void duplicate(String word){
		
		char[] characters=word.toCharArray();
		Map<Character, Integer> charmap = new HashMap<Character, Integer >();
		for(Character ch:characters){
			if(charmap.containsKey(ch))
			{
				charmap.put(ch, charmap.get(ch)+1);
		}
			else{
				charmap.put(ch, 1);
			
			}
			}
		Set<Map.Entry<Character, Integer>> entryset = charmap.entrySet();
		System.out.println("this is my output");
		for(Map.Entry<Character, Integer> entry:entryset ){
			if(entry.getValue()>1){
				
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			}
		}
		// TODO Auto-generated method stub

	}

}
