package java_string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileWriter;
import java.io.InputStreamReader;


public class sample1 {
	
	public void InputDicNum(String filePath){ //�����д���ֵ䣬��ͬ��ʴ���֮
		try {
            String encoding="GBK";
            File file=new File(filePath);
            if(file.isFile() && file.exists()){ //�ж��ļ��Ƿ����
              InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);//���ǵ������ʽ
           //   FileWriter out =  new FileWriter(endPath);
              BufferedReader bufferedReader = new BufferedReader(read);
              String lineTxt;
      
              StringBuilder builder = new StringBuilder();
              while((lineTxt = bufferedReader.readLine()) != null){
            	 String str[] = lineTxt.split(" ");
            	 
            	 System.out.println(str[0]+" "+str[1]);
                }
                read.close();
               // out.close();
        }else{
         System.out.println("�Ҳ���ָ�����ļ�");
     }
    }catch (Exception e) {
     // System.out.println("��ȡ�ļ����ݳ���");
      e.printStackTrace();
    }
 }
	public static void main(String[] args){
		String filePath="C:/Users/Administrator/Desktop/Dicword/dic2.dic";
		sample1 a= new sample1();
		a.InputDicNum(filePath);
	}
}
