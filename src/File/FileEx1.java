package File;

import java.io.File;

public class FileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C://hello.txt");
		System.out.println("�������� ���� :" +file.isFile());
		System.out.println("���丮���� ����: " + file.isDirectory());
		System.out.println("����� : " + file.getPath());
		System.out.println("������ : " + file.getAbsolutePath());
		System.out.println("���丮 Ȥ�� ������ �̸� : "+ file.getName());
		System.out.println("������ ���� :" + file.length());
		System.out.println("������ ���� ���� ��¥" + file.lastModified());
		// test
		System.out.println("test");
	}
}
