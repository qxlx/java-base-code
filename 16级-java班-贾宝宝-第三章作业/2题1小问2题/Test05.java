// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Test05.java

import java.io.PrintStream;
import java.util.Scanner;

public class Test05
{

	public Test05()
	{
	}

	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入两个数，将它们的值进行转化，显示出它的结果：");
		int i = scanner.nextInt();
		int j = scanner.nextInt();
		int k = 0;
		k = i;
		i = j;
		j = k;
		System.out.println((new StringBuilder()).append("number1=").append(i).append(",number2=").append(j).toString());
	}
}
