package it.unibo.pslab.oop.p11gencoll2.wildcard;
public class Unbounded{
    
    public static void printLength(Vector<?> vect){
    	// Questo metodo usa solo 'int getLength()'
    	// Quindi l'input può essere bi-variante!
    	System.out.println(vect.getLength());
    }
    
    public static void main(String[] s){
    	Vector<Integer> vector = new Vector<>();
    	vector.addElement(1);
    	vector.addElement(2);
    	vector.addElement(3);
    	// Posso passare Vector<Integer> dove si attende
    	// Vector<?>
    	printLength(vector);
    }
} 
