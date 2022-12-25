package Test1;

import java.util.HashMap;
import java.util.Map;

public class stringMapOutput 
{
	
	
	public stringMapOutput(String res)
	{
		this.res = res;
	}
	
	private String res;
	
	public static void main(String args[])
	{
		Map<String, Integer> mapStr1 = new HashMap<String,Integer>();
		String str1 = new String("Java Charter1");
		String str2 = new String ("Java Charter2");
		
		mapStr1.put(str1, new Integer(20));
		mapStr1.put(str2, new Integer(40));
		
		Map<stringMapOutput, Integer> mapStr2 = new HashMap<stringMapOutput,Integer>();
		stringMapOutput str3 = new stringMapOutput(str1);
		stringMapOutput str4 = new stringMapOutput (str2);
		
		mapStr2.put(str3, new Integer(20));
		mapStr2.put(str4, new Integer(40));
		
		System.out.println(mapStr1.get(str1));
		System.out.println(mapStr2.get(str3));
		
	}
	
}


