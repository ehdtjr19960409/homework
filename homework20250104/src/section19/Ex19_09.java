package section19;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex19_09 {
	public static void main(String[] args) {
		int read = 0;
		
		Reader in = null;
		
		try {
			in = new FileReader("file_korean.txt");
			char[] buffer = new char[256];
			
			while(true) {
				
				read = in.read(buffer);
				
				if(read == -1) {
					break;
				}
				System.out.println(String.valueOf(buffer , 0, read));
			}
		}catch(IOException e) {
			System.out.println("Error : "+ e.getMessage());
		}finally {
			
			try {
				
				if(in != null) {
					in.close();
					
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
