package com.javafileio;

import java.io.FileOutputStream;

public class JavaFileIOExample1 {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("souro.txt");
			String s = "Learn for passion not for duty";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
