package it.unibo.pslab.oop.p16io.files;

import java.io.*;

public class UseDataStream {

	public static void main(String[] args) throws IOException {

		try (
			final OutputStream file = new FileOutputStream(UseFile.FILE_NAME);
			final DataOutputStream dstream = new DataOutputStream(file);
		) {
			dstream.writeBoolean(true);
			dstream.writeInt(10000);
			dstream.writeUTF("Ciao");
			dstream.writeDouble(5.2);
		}
		try (
			final InputStream file2 = new FileInputStream(UseFile.FILE_NAME);
			final DataInputStream dstream2 = new DataInputStream(file2);
		){
			IO.println(dstream2.readBoolean()); // Do not change order
			IO.println(dstream2.readInt());
			IO.println(dstream2.readUTF());
			IO.println(dstream2.readDouble());
		}
	}
}
