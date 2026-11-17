package it.unibo.pslab.oop.p18streams;

import java.nio.file.*;
import java.nio.charset.*;

public class UseOtherFactories {
	
	private final static String aDir = "/home/mirko/aula";
	private final static String aFile = "/home/mirko/aula/oop/17/Counter.java";
	
	public static void main(String[] args) throws Exception {
		
		final Path dirPath = FileSystems.getDefault().getPath(aDir);
		
		IO.println("Found below "+aDir);
		Files.find(dirPath, 2, (a,b)->true).forEach(IO::println);
	    
		IO.println("List directory "+aDir);
		Files.list(dirPath).forEach(IO::println);
	    
		final Path filePath = FileSystems.getDefault().getPath(aFile);
	    
		IO.println("Contenuto of "+aFile);
		Files.lines(filePath).forEach(IO::println);
	    
		IO.println("Contenuto of "+aFile+" in altra codifica");
		Files.lines(filePath,StandardCharsets.ISO_8859_1).forEach(IO::println);
	    
		// Si veda il sorgente di BufferedReader.lines() per capire come si realizza
		// uno stream a partire da un iteratore
		
		IO.println("Stream da una stringa..");
		"Hellò!".chars().mapToObj(i->(char)i).forEach(IO::println);
	}
}

