package section19;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex19_11 {
	public static void main(String[] args) {
		FileInputStream in = null;
		BufferedInputStream bis = null;
		try {
			in = new FileInputStream("fileText.txt");
			bis = new BufferedInputStream(in);
			int read = 0;
			
			while((read = bis.read())!=-1) {
				System.out.print((char)read);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bis != null) {
					bis.close();
				}
				if(in != null) {
					in.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
