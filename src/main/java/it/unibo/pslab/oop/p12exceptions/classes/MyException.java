package it.unibo.pslab.oop.p12exceptions.classes;

public class MyException extends RuntimeException{
    
    // keeping track of arguments, explaining the problem
    private final String[] args;
    
    public MyException(final String s, final String[] args){
    	super(s);
    	this.args = args;
    }
    
    // overring toString
    public String toString(){
    	String str = "Stato argomenti: ";
    	str = str + java.util.Arrays.toString(args);
    	str = str + "\n" + super.toString();
    	return str;
    }
}

