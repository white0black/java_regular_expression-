package firsttest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice2 {

	public static void main(String[] args) throws IOException {
		File file=new File("C:/Users/Administrator/workspace/regular expression/src/firsttest/a.html");
		 String regex="\\w+@[0-9A-Za-z]+(\\.[a-zA-Z]{2,3}){1,2}";
		List<String>maillist=getmails(file, regex);

		for(String mail:maillist){
	System.out.println(mail);
}
	}

	private static List<String> getmails(File file,String regex) throws IOException {
//1��ȡ����
		BufferedReader buffer=new BufferedReader(new FileReader(file));
//2�������װ��pattern
		Pattern p = Pattern.compile(regex);
//		3����list����
		List<String> returnlist=new ArrayList<String>();
		
		String line=null ;
       while((line=buffer.readLine())!=null)
{    Matcher m=p.matcher(line);
while(m.find()){
	returnlist.add(m.group());
}
	}
		return returnlist;
	}

}
