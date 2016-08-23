package com.javafileio;

import java.io.FileOutputStream;

public class JavaFileIOExample1 {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("demo.txt");
			String s = "Doing changes for branch: temp_branch";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
