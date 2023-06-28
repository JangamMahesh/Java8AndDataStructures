package DS;

import java.util.stream.IntStream;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		int[] arr= {1,1,2,3,4,5};
	
		String string = String.join("", IntStream.of(arr).mapToObj(i->String.valueOf(i)).toArray(String[]::new));
		
		
		
		for (char c : string.toCharArray()) {
			if(string.indexOf(c)==string.lastIndexOf(c))
			{
				System.out.println("first Non repeating character "+ c);
				break;
			}
		}
	}

}
