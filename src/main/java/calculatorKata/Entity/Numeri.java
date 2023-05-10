package calculatorKata.Entity;

public class Numeri {
private String numeri;
public Numeri() {}
public Numeri(String numeri) {
	super();
	this.numeri = numeri;
}
public String getNumeri() {
	return numeri;
}
public void setNumeri(String numeri) {
	this.numeri = numeri;
}
@Override
public String toString() {
	return "Numeri [numeri=" + numeri + "]";
}

}
