package org.java.animals;

import org.java.animals.abs.Animale;
import org.java.animals.inter.INuotante;
import org.java.animals.inter.IVolante;

public class Main {
	public static void main(String[] args) {
		
		final int LNG = 4;
		
		Animale[] animali = new Animale[LNG];
		
		animali[0] = new Cane("Bassotto", 4, 6.2f, true);
		animali[1] = new Aquila("Aquila reale", 2, 4.3f, true);
		animali[2] = new Passerotto("Passero domestico", 4, 0.04f, true);
		animali[3] = new Delfino("Tursiope", 0, 320.5f, true);
		
		for(int i=0; i<LNG; i++) {
			System.out.println("Animale " + (i+1) + ":");
			Animale a = animali[i];
			System.out.println(a);
			a.verso();
			a.mangia();
			
			if (a instanceof Cane || a instanceof Delfino || a instanceof Aquila) {
				faiNuotare(a);
			}
			
			if (a instanceof Passerotto || a instanceof Aquila) {
				faiVolare(a);
			}
			
			System.out.println("\n----------------------------\n");
		}
	}
	
	static void faiVolare(IVolante animale) {
		animale.vola();
	}
	
	static void faiNuotare(INuotante animale) {
		animale.nuota();
	}
}
