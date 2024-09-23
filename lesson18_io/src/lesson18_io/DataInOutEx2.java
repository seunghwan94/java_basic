package lesson18_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInOutEx2 {
	public static void main(String[] args) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\tj\\Desktop\\test2.txt"));
		dos.writeInt(1);
		dos.writeChar('가');
		dos.writeChars("가a");
		dos.writeUTF("가a");
		
//		dos.writeDouble(Math.PI);
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\tj\\Desktop\\test2.txt"));
		int d = dis.readInt();
		System.out.println(d);
		dis.close();
	}
}
