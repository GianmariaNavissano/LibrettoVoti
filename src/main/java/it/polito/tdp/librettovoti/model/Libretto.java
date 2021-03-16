package it.polito.tdp.librettovoti.model;

import java.util.*;

public class Libretto {

	private List<Voto> voti;
	
	public Libretto() {
		this.voti = new ArrayList<Voto>();
	}
	
	public void add(Voto v) {
		this.voti.add(v);
	}
	
	public String toString() {
		String s = "";
		for(Voto v : voti) {
			s+= v.toString()+"\n";
		}
		return s;
	}
	
	public List<Voto> listaVotiUguali(int punteggio) {
		List<Voto> votiUguali = new ArrayList<Voto>();
		for(Voto v : voti) {
			if(v.getVoto()==punteggio)
				votiUguali.add(v);
		}
		return votiUguali;
	}
	
	public Libretto votiUguali(int punteggio) {
		Libretto l = new Libretto();
		for(Voto v : voti) {
			if(v.getVoto()==punteggio)
				l.add(v);
		}
		return l;
	}
	
	public Voto ricercaCorso(String nomeCorso) {
		for(Voto v : voti) {
			if (v.getNome().equals(nomeCorso))
				return v;
		}
		return null;
	}
}
