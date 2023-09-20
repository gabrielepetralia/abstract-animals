package org.java.animals;

import org.java.animals.abs.Animale;

public class Passerotto extends Animale {
	
	public Passerotto (String nome, int numZampe, float peso, boolean vertebrato) {
		super(nome, numZampe, peso, vertebrato);
	}
	
	@Override
	public void verso() {
		System.out.println("Cip cip");
	}
	
	@Override
	public void mangia() {
		System.out.println("Vermi");
	}
}
