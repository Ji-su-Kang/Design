package File;

import java.io.*;

public class FileEx3 {
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		//파일 생성 
		File f1 = new File("c:/newFile.txt"); //빈 파일이 만들어짐 
		//if(f1.exists()){
		//	System.out.println("파일이름:"+f1.getName());
		//}else{
			//IOException 발생
			//try{
			//if(f1.createNewFile()){
			//	System.out.println("새로운 파일을 만들었습니다");
			//}
			//}catch(Exception e){
				
			//}
		//}
		/*
		//디렉토리 생성
		File f2 = new File("c:/newDirectory");
		if(!f2.exists()){
			f2.mkdir();
		}else{
			System.out.println("디렉토리 이름:"+f2.getPath());
		}
		
		//파일 혹은 디렉토리 삭제
		File f3 = new File("c:/text.txt");
		if(f3.exists()){
			f3.delete();
		}
		/*
		///파일 혹은 디렉토리 이름 변경
		File src = new File("c:/newFile.txt");
		File dest = new File("c:/newDeirectory/desc.txt");
		File dest2 = new File("c:/newDirectory/desc2.txt");
		
		if(src.exists()){
			src.renameTo(dest);
			src.renameTo(dest2);
		}
		
		if(f2.isDirectory()){ //디렉토리 목록을 출력함.
			String dir[] = f2.list();
			System.out.println("\n\n Dir Content:============\n");
			for(String dirs : dir){
				System.out.println("dirs :"+ dirs);
			}
		}
		*/
	}
}