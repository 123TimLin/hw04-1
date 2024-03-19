package hw04;

import java.util.Scanner;

public class hw4_1 {

	public static void main(String[] args)
	{	
		String temp="";	
		Scanner sc=new Scanner(System.in);
		System.out.println("這是可以陪你聊程式!你可以問我一些問題");
		while(true) 
		{
			System.out.print("你說:");
			temp=sc.nextLine();
			System.out.print("我說:");
			String result=temp.replace("嗎", "").replace("你", "我").replace("?", "!");
			System.out.println(result);
			
			if(temp.equals("0")) 
			{
				System.out.println("離開聊天程序");
				break;
			}
		}

	}

}
