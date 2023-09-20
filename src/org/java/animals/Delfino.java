package org.java.animals;

import org.java.animals.abs.Animale;

public class Delfino extends Animale {
	
	public Delfino (String nome, int numZampe, float peso, boolean vertebrato) {
		super(nome, numZampe, peso, vertebrato);
	}
	
	@Override
	public void verso() {
		System.out.println("Boh");
	}
	
	@Override
	public void mangia() {
		System.out.println("Pesci");
	}
}
