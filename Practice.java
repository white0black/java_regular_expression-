package firsttest;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
	  //test1();
//	  test2();
	  test3();
	}
 static void test1(){
	 //����...��...��Ҫ..ҪҪ...ѧѧ...ѧ��...���...��
	 //��ԭΪ����Ҫѧ���
	 String temp="����...��...��Ҫ..ҪҪ...ѧѧ...ѧ��...���...��";  
       System.out.println(temp);
       
       temp=temp.replaceAll("\\.+", "");   //1ȥ����.��
	 System.out.println(temp);
	 temp=temp.replaceAll("(.)\\1+", "$1");  //2ȥ������
	 System.out.println(temp);
	 
 }
 static void test2(){
	// ip��123.2.54.4   192.168.0.1  2.20. 3.2  16.3.12.51  ����
	 String temp="123.2.54.4   192.168.0.1  2.20.3.2  16.3.12.51  ";  
     System.out.println(temp);
     
     temp=temp.replaceAll("(\\d+)", "00$1");  //��00
     System.out.println(temp);
     
     temp=temp.replaceAll("0*(\\d{3})", "$1");  //  *��ʾû�л���  ������3λ
     System.out.println(temp);
                                                                        //split
   String[] p=temp.split(" +");	 
   Arrays.sort(p);                                      //Arrays.sort
for(String ip:p){
		 System.out.println(ip);
	 }
	//output: 
//123.2.54.4   192.168.0.1  2.20.3.2  16.3.12.51  
//00123.002.0054.004   00192.00168.000.001  002.0020.003.002  0016.003.0012.0051  
//123.002.054.004   192.168.000.001  002.020.003.002  016.003.012.051  
//002.020.003.002
//016.003.012.051
//123.002.054.004
//192.168.000.001
 }
 static void test3(){
//	 У���ʼ���ַ
	 String temp="asd@asd.com.cn";
	//  String regex="\\w+@[0-9A-Za-z]+(\\.[a-zA-Z]{2,3}){1,2}";
	  String regex="\\w+@\\w+(\\.\\w+)+";            //ģ��ƥ��
	  boolean b =temp.matches(regex);
	  System.out.println(temp+":"+b);
 }

}
