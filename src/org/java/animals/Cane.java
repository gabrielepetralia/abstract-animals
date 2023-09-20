package org.java.animals;

import org.java.animals.abs.Animale;

public class Cane extends Animale {
	
	public Cane (String nome, int numZampe, float peso, boolean vertebrato) {
		super(nome, numZampe, peso, vertebrato);
	}
	
	@Override
	public void verso() {
		System.out.println("Bau");
	}
	
	@Override
	public void mangia() {
		System.out.println("Croccantini");
	}
}
