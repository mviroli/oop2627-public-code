package it.unibo.pslab.oop.p16io.files;

import java.io.*;
import java.util.*;
import java.lang.reflect.*;

public class UseFile2 {
	
	public static final String FILE_NAME = "/home/mirko/aula/oop/14/prova.bin";

	
	public static void main(String[] args) throws Exception {
		final File f = new File( FILE_NAME );
		IO.println(f.getCanonicalPath());
	}
}
