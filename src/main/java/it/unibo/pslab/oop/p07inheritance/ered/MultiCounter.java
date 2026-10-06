package it.unibo.pslab.oop.p07inheritance.ered;

/* Si noti la clausola extends, per estendere una classe */
public class MultiCounter extends Counter {

    /*
     * I costruttori vanno ridefiniti. Devono tuttavia richiamare 
     * con super(...) quelli ereditati dalla sopraclasse
     */
    public MultiCounter(int initialValue) {
    	super(initialValue);
    }

    // increment e getValue automaticamente ereditati

    // si aggiunge multiIncrement
    public void multiIncrement(final int n) {
        for (int i = 0; i < n; i++) {
            this.increment();
        }
    }
}
