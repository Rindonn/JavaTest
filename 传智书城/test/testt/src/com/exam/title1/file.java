package com.exam.title1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class file {
		public static void main(String[] args) throws IOException {
			FileInputStream fis = new FileInputStream("C:/log.txt");
			FileOutputStream  fos  = new FileOutputStream("D:/log2.txt");
			byte[] b = new byte[1024];
			while(fis.read(b)!=-1)
			{
				fos.write(b);
			}
			fos.close();
			fis.close();
	}

}
