package HOJ;
import java.util.*;
public class OJ1048 {

	static TreeMap<String, String> map = new TreeMap<String, String>();
	static final String start = "START";
	static final String end = "END";
	static final String over = "ENDOFINPUT";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String cipher = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
		String Plain = "V W X Y Z A B C D E F G H I J K L M N O P Q R S T U ";
		String[] cs = cipher.split("\\s");
		String[] ps = Plain.split("\\s");
		
		for(int i=0; i<cs.length; ++i)
		{
			map.put(cs[i], ps[i]);
		}
		//System.out.println(map.get("N"));
		String line=input.nextLine();
		while(line.equals(start) && !line.equals(over))
		{
			line = input.nextLine();
			StringBuilder sb = new StringBuilder();
			while(!line.equals(end))
			{
				for(int i=0; i<line.length(); ++i)
				{
					String character = line.charAt(i)+"";
					if(map.containsKey(character))
						sb.append(map.get(character));
					else
					{
						sb.append(character);
					}
					
				}
				//sb.append("\n");
				line = input.nextLine();
			}
			System.out.println(sb);
			line = input.nextLine();
			
		}
	}

}
