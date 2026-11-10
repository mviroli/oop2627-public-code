package it.unibo.pslab.oop.p16io.files;

import java.io.*;

public class UseBufferedDataStream {

		public static void main(String[] args) throws IOException {
		// dstream -> bstream -> file
		try (
			final OutputStream file = new FileOutputStream(UseFile.FILE_NAME);
			final OutputStream bstream = new BufferedOutputStream(file);
			final DataOutputStream dstream = new DataOutputStream(bstream);
		){
			dstream.writeBoolean(true);
			dstream.writeInt(10000);
			dstream.writeDouble(5.2);
			dstream.writeUTF("Prova"); // Scrive in rappresentazione UTF-16
		}
		// dstream2 -> bstream2 -> file2
		try (
			final InputStream file2 = new FileInputStream(UseFile.FILE_NAME);
			final InputStream bstream2 = new BufferedInputStream(file2);
			final DataInputStream dstream2 = new DataInputStream(bstream2);
		){
			IO.println(dstream2.readBoolean()); // Do not change order!!
			IO.println(dstream2.readInt());
			IO.println(dstream2.readDouble());
			IO.println(dstream2.readUTF());
		}
	}
}
