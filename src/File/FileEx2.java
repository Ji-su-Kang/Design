package File;

import java.io.File;

public class FileEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File directory = new File("c:/");
		if(directory.exists()){
			if(directory.isDirectory()){
			//���� ���丮���� ��� ���� ���丮�� �̸� ���
				String[] fileNameList = directory.list();
				for(String fileName : fileNameList){
					System.out.println("���� �̸� : " + fileName);
				}
			}
		}
	}

}
