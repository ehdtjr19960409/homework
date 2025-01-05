package section19;

import java.io.FileWriter;

public class Ex19_10 {
 public static void main(String[] args) {
	FileWriter w = null;
	try {
		w= new FileWriter("fileText.txt", false);
		w.write('H');
		w.write('A');
		w.write('P');
		w.write('P');
		w.write('Y');
		w.write('\n');
		System.out.println("파일 생성완료");
	}catch(Exception e) {
		e.printStackTrace();
	}finally{
		try {
			if(w != null) {
				w.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
}
