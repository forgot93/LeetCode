package java_string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileWriter;
import java.io.InputStreamReader;


public class sample1 {
	
	public void InputDicNum(String filePath){ //将序号写入字典，再同义词处理之
		try {
            String encoding="GBK";
            File file=new File(filePath);
            if(file.isFile() && file.exists()){ //判断文件是否存在
              InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);//考虑到编码格式
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
         System.out.println("找不到指定的文件");
     }
    }catch (Exception e) {
     // System.out.println("读取文件内容出错");
      e.printStackTrace();
    }
 }
	public static void main(String[] args){
		String filePath="C:/Users/Administrator/Desktop/Dicword/dic2.dic";
		sample1 a= new sample1();
		a.InputDicNum(filePath);
	}
}
