package curso_N2;

public class Classe_notas {
private double 
N1 = 0,
N2 = 0,
N3 = 0;



public Classe_notas(double n1, double n2, double n3) {
	this.N1 = n1;
	this.N2 = n2;
	this.N3 = n3;
}


// N1 get e set
public double getN1() {
	return N1;
}

public void setN1(double n1) {
	this.N1 = n1;
}


//N2 get e set
public double getN2() {
	return N2;
}

public void setN2(double n2) {
	this.N2 = n2;
}


//N3 get e set
public double getN3() {
	return N3;
}

public void setN3(double n3) {
	this.N3 = n3;
}

// get media
public double getMedia() {
	return (N1+N2+N3)/3;
}


@Override
public String toString() {
	return "Classe_notas [N1=" + N1 + ", N2=" + N2 + ", N3=" + N3 + "]";
}



}
