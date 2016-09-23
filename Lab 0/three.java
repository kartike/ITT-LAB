import java.util.*;
import java.io.*;

public class three
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		try 
		{
		    StringBuilder sbb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sbb.append(line);
		        line = br.readLine();
		    }
		    StringBuffer sb=new StringBuffer(sbb);  
			sb.reverse(); 
		    System.out.println(sb);
			PrintWriter writer = new PrintWriter("newFile.txt", "UTF-8");
			writer.println(sb);
			writer.close();
			br.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}