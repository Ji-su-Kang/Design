package File;

import java.io.*;

public class FileEx3 {
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		//���� ���� 
		File f1 = new File("c:/newFile.txt"); //�� ������ ������� 
		//if(f1.exists()){
		//	System.out.println("�����̸�:"+f1.getName());
		//}else{
			//IOException �߻�
			//try{
			//if(f1.createNewFile()){
			//	System.out.println("���ο� ������ ��������ϴ�");
			//}
			//}catch(Exception e){
				
			//}
		//}
		/*
		//���丮 ����
		File f2 = new File("c:/newDirectory");
		if(!f2.exists()){
			f2.mkdir();
		}else{
			System.out.println("���丮 �̸�:"+f2.getPath());
		}
		
		//���� Ȥ�� ���丮 ����
		File f3 = new File("c:/text.txt");
		if(f3.exists()){
			f3.delete();
		}
		/*
		///���� Ȥ�� ���丮 �̸� ����
		File src = new File("c:/newFile.txt");
		File dest = new File("c:/newDeirectory/desc.txt");
		File dest2 = new File("c:/newDirectory/desc2.txt");
		
		if(src.exists()){
			src.renameTo(dest);
			src.renameTo(dest2);
		}
		
		if(f2.isDirectory()){ //���丮 ����� �����.
			String dir[] = f2.list();
			System.out.println("\n\n Dir Content:============\n");
			for(String dirs : dir){
				System.out.println("dirs :"+ dirs);
			}
		}
		*/
	}
}