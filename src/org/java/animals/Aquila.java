package org.java.animals;

import org.java.animals.abs.Animale;

public class Aquila extends Animale {
	
	public Aquila (String nome, int numZampe, float peso, boolean vertebrato) {
		super(nome, numZampe, peso, vertebrato);
	}
	
	@Override
	public void verso() {
		System.out.println("Aaaaahhhh");
	}
	
	@Override
	public void mangia() {
		System.out.println("Carne");
	}
}
