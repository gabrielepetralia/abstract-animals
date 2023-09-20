package org.java.animals.abs;

import org.java.animals.inter.INuotante;
import org.java.animals.inter.IVolante;

public abstract class Animale implements IVolante, INuotante {
	String nome;
	int numZampe;
	float peso;
	boolean vertebrato;
	
	public Animale(String nome, int numZampe, float peso, boolean vertebrato){
		setNome(nome);
		setNumZampe(numZampe);
		setPeso(peso);
		setVertebrato(vertebrato);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumZampe() {
		return numZampe;
	}

	public void setNumZampe(int numZampe) {
		this.numZampe = numZampe;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public boolean isVertebrato() {
		return vertebrato;
	}
	
	public void setVertebrato(boolean vertebrato) {
		this.vertebrato = vertebrato;
	}
	
	public void dormi() {
		System.out.println("Zzz");
	}
	
	public abstract void verso();
	
	public abstract void mangia();
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " | " + "Numero zampe: " + getNumZampe() + " | " + "Peso: " +  getPeso() + "kg | " + (isVertebrato() ? "Vertebrato" : "Invertebrato");
	}
	
	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
	}
	
	@Override
	public void nuota() {
		System.out.println("Sto nuotando!!!");
	}
}

