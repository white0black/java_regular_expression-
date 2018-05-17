package firsttest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {				
//		match();               //匹配matches
		// matchDemo();             
//	spiltDemo();                      //切分
	replaceDemo();                 //替换

	 // getDemo();               //取出来
		
			
	}
 public static void match(){
	 String qq="q12155";
		String way="^q[1-9]{0,4}";
		boolean b=qq.matches(way);
			System.out.println("qq:"+b);
	 
 }
 public static void matchDemo(){
	 //验证手机号码是否正确
	 String tel="01215";
		String way="0[1-9]{4}";
		boolean b=tel.matches(way);
			System.out.println("telphone number:"+b);
	 
 }
 public static void spiltDemo(){
	 //
//	 String tel="01,21,5";
//		String way=",";
//		String tel="01.21.5";
//		String way="\\.";
	 String tel="01.11.1115sadasdas11ddddddde";
			String way="(1)\\1{2}";  //为了实现规则的复用，用（）将复用的规则封装，成为正则表达式中的组，每一个组都有编号，从1开始。通过使用编号就可以复用对应组的规则内容。
														//注意：编号必须在组的后面，即！先封装后调用   组可以通过从左到右计算其开括号来编号
			                                           //	String way="(1)\\1+(d)\\2+"; String way="(11\\.)"; 
		String[] b=tel.split(way);
		for(String b1:b)
			System.out.println("/"+b1+"/");
	 
 }
 public static void replaceDemo(){
	 //验证手机号码是否正确
//	 String tel="12300001215";
//		tel=tel.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
	 String tel="12300012215";
		tel=tel.replaceAll("(.)\\1+", "$1$1");
			System.out.println("telphone number:"+tel);
	 
 }
 public static void getDemo(){
//实现获取，把符合规则的内容取出来
//用到正则表达式对象。java。util。regex。Pattern
//
//1将字符串规则封装成Pattern对象 。compile.(regex);
//2通过正则对象获取匹配对象。用于将正则规则作用到要操作的字符串上
//3通过匹配器对象的方法，对字符串进行操作
//因此，典型的调用顺序是 
//Pattern p = Pattern.compile("a*b"); 规则编译为对象
//Matcher m = p.matcher("aaaaab");  和要操作的字符串关联，生成匹配器对象
//boolean b = m.matches();       使用匹配器对象方法对字符串操作
	 
	//获取字符串符合规则的内容
	 String temp="liu liuu lpu li liiu";
	 String regex="\\b[a-zA-Z]{3}\\b";   //正则表达式
	 
	 //1 将规则编译为pattern对象
	 Pattern p = Pattern.compile(regex);
	 //2 和字符串关联，获取匹配器对象。
	 Matcher m =p.matcher(temp);
	// 3 使用匹配器对象方法对字符串操作
	// System.out.println(m.find()); 
	 System.out.println(temp+" //find a word of 3 letters:"); 
	 while(m.find())
	 { System.out.println(m.start()+":"+m.group()+":"+m.end());
	 }
	 //必须先find才能用后面的start之类的方法！	 
 }

}
