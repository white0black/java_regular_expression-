package firsttest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {				
//		match();               //ƥ��matches
		// matchDemo();             
//	spiltDemo();                      //�з�
	replaceDemo();                 //�滻

	 // getDemo();               //ȡ����
		
			
	}
 public static void match(){
	 String qq="q12155";
		String way="^q[1-9]{0,4}";
		boolean b=qq.matches(way);
			System.out.println("qq:"+b);
	 
 }
 public static void matchDemo(){
	 //��֤�ֻ������Ƿ���ȷ
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
			String way="(1)\\1{2}";  //Ϊ��ʵ�ֹ���ĸ��ã��ã��������õĹ����װ����Ϊ������ʽ�е��飬ÿһ���鶼�б�ţ���1��ʼ��ͨ��ʹ�ñ�žͿ��Ը��ö�Ӧ��Ĺ������ݡ�
														//ע�⣺��ű�������ĺ��棬�����ȷ�װ�����   �����ͨ�������Ҽ����俪���������
			                                           //	String way="(1)\\1+(d)\\2+"; String way="(11\\.)"; 
		String[] b=tel.split(way);
		for(String b1:b)
			System.out.println("/"+b1+"/");
	 
 }
 public static void replaceDemo(){
	 //��֤�ֻ������Ƿ���ȷ
//	 String tel="12300001215";
//		tel=tel.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
	 String tel="12300012215";
		tel=tel.replaceAll("(.)\\1+", "$1$1");
			System.out.println("telphone number:"+tel);
	 
 }
 public static void getDemo(){
//ʵ�ֻ�ȡ���ѷ��Ϲ��������ȡ����
//�õ�������ʽ����java��util��regex��Pattern
//
//1���ַ��������װ��Pattern���� ��compile.(regex);
//2ͨ����������ȡƥ��������ڽ�����������õ�Ҫ�������ַ�����
//3ͨ��ƥ��������ķ��������ַ������в���
//��ˣ����͵ĵ���˳���� 
//Pattern p = Pattern.compile("a*b"); �������Ϊ����
//Matcher m = p.matcher("aaaaab");  ��Ҫ�������ַ�������������ƥ��������
//boolean b = m.matches();       ʹ��ƥ�������󷽷����ַ�������
	 
	//��ȡ�ַ������Ϲ��������
	 String temp="liu liuu lpu li liiu";
	 String regex="\\b[a-zA-Z]{3}\\b";   //������ʽ
	 
	 //1 ���������Ϊpattern����
	 Pattern p = Pattern.compile(regex);
	 //2 ���ַ�����������ȡƥ��������
	 Matcher m =p.matcher(temp);
	// 3 ʹ��ƥ�������󷽷����ַ�������
	// System.out.println(m.find()); 
	 System.out.println(temp+" //find a word of 3 letters:"); 
	 while(m.find())
	 { System.out.println(m.start()+":"+m.group()+":"+m.end());
	 }
	 //������find�����ú����start֮��ķ�����	 
 }

}
