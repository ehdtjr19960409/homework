package section19;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex19_12 {
	public static void main(String[] args) {
		FileInputStream readFile = null;
		FileInputStream bisReadFile = null;
		BufferedInputStream bis = null;
		
		try {
			System.out.println("기본 스트림으로 읽기 시작");
			readFile = new FileInputStream("back.jpg");
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작1");
			while(readFile.read() != -1) {
				
			}
			System.out.println("이미지 읽기 종료1");
			long end = System.currentTimeMillis();
			long time = (end -start)/1000;
			
			System.out.println("소요 시간 : " + time + "초");
			System.out.println("기본 스트림으로 읽기 종료");
			
			System.out.println("보조스트림으로 읽기 시작");
			bisReadFile = new FileInputStream("back.jpg");
			bis = new BufferedInputStream(bisReadFile);
			start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작2");
			while(bis.read()!= -1) {
				
			}
			System.out.println("이미지 읽기 종료2");
			end = System.currentTimeMillis();
			double result = (double)(end - start) / 1000;
			System.out.println("소요 시간 : " + result + "초");
			System.out.println("보조 스트림으로 읽기 종료");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bis !=null) {
					bis.close();
				}
				if(bisReadFile != null) {
					readFile.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
