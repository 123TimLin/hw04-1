package hw04;

import java.util.Scanner;

public class hw4_1 {

	public static void main(String[] args)
	{	
		String temp="";	
		Scanner sc=new Scanner(System.in);
		System.out.println("�o�O�i�H���A��{��!�A�i�H�ݧڤ@�ǰ��D");
		while(true) 
		{
			System.out.print("�A��:");
			temp=sc.nextLine();
			System.out.print("�ڻ�:");
			String result=temp.replace("��", "").replace("�A", "��").replace("?", "!");
			System.out.println(result);
			
			if(temp.equals("0")) 
			{
				System.out.println("���}��ѵ{��");
				break;
			}
		}

	}

}
