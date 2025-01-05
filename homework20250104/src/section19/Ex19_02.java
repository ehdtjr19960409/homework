package section19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex19_02 {
	public static void main(String[] args) {
		int read = 0;
		InputStream in = null;
		
		byte[] buffer = new byte[5];
		try {
			in=new FileInputStream("my_file.txt");
			while(true) {
			read = in.read(buffer);
			if(read ==-1) {
				break;
			}
			System.out.print(new String(buffer, 0 , read));
		}
		
	}catch(IOException e){
		System.out.println("Error: "+ e.getMessage());
	}finally {
		try {
			if(in != null) {
				in.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

}