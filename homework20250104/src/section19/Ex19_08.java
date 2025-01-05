package section19;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex19_08 {
	public static void main(String[] args) {
		int read = 0;
		Reader reader = null;
		try {
			reader = new FileReader("file_korean.txt");
			while(true) {
				read = reader.read();
				
				if(read == -1) {
					break;
				}System.out.println((char)read);
			}
		}	catch(IOException e){
				System.out.println("Error : "+ e.getMessage());
			
			}finally {
				try {
					if(reader != null) {
						reader.close();
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		
	}
}
