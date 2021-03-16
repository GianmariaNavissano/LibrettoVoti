package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;
import java.util.*;

public class TestLibretto {
	
	public static void main(String[] args) {
		
		System.out.println("Test metodi di Libretto");
		Libretto libretto = new Libretto();
		
		Voto voto1 = new Voto("Analisi 1", 30, LocalDate.of(2019, 2, 15));
		libretto.add(voto1);
		
		libretto.add(new Voto("Fisica 1", 28, LocalDate.of(2019,  7,  20)));
		libretto.add(new Voto("Informatica", 29, LocalDate.of(2019,  7,  13)));
		
		System.out.println(libretto);
		
		List<Voto> venticinque = libretto.listaVotiUguali(25);
		Libretto librettoVenticinque = libretto.votiUguali(25);
		
	}
}
