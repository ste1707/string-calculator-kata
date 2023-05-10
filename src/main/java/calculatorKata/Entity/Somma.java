package calculatorKata.Entity;

public class Somma {
private int risultato;

public Somma() {}

public Somma(int risultato) {
	super();
	this.risultato = risultato;
}

public int getRisultato() {
	return risultato;
}

public void setRisultato(int risultato) {
	this.risultato = risultato;
}

@Override
public String toString() {
	return "Somma [risultato=" + risultato + "]";
}



}
