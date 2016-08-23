package com.javafileio;

import java.io.FileOutputStream;

public class JavaFileIOExample1 {
	public static void main(String args[]) {
		try {
			/* Creating FileOutputStream object here to write in a file*/
			FileOutputStream fout = new FileOutputStream("demo.txt");
			String s = "Doing changes for branch: temp_branch";
			/*Converting string to byte and then storing it into byte array */
			byte c[] = s.getBytes();
			fout.write(c);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
