package File;

import java.io.File;

public class FileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C://hello.txt");
		System.out.println("파일인지 여부 :" +file.isFile());
		System.out.println("디렉토리인지 여부: " + file.isDirectory());
		System.out.println("상대경로 : " + file.getPath());
		System.out.println("절대경로 : " + file.getAbsolutePath());
		System.out.println("디렉토리 혹은 파일의 이름 : "+ file.getName());
		System.out.println("파일의 길이 :" + file.length());
		System.out.println("파일의 최종 수정 날짜" + file.lastModified());
		// test
		System.out.println("test");
	}
}
