package File;

import java.io.File;

public class FileEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File directory = new File("c:/");
		if(directory.exists()){
			if(directory.isDirectory()){
			//현재 디렉토리내의 모든 파일 디렉토리의 이름 얻기
				String[] fileNameList = directory.list();
				for(String fileName : fileNameList){
					System.out.println("파일 이름 : " + fileName);
				}
			}
		}
	}

}
