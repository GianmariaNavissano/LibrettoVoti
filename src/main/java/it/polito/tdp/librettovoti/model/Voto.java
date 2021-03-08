package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

//POJO - Plain Old Java Object
/**
 * 
 * @author gianmarianavissano
 *
 */
public class Voto {

	private String nome;
	private int voto;
	private LocalDate data;
	
	/**
	 * 
	 * @param nome : nome del corso
	 * @param voto : voto ottenuto
	 * @param data : data esame
	 */
	public Voto(String nome, int voto, LocalDate data) {
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getVoto() {
		return voto;
	}


	public void setVoto(int voto) {
		this.voto = voto;
	}


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "Esame " + nome + " superato con " + voto + " in data " + data;
	}
	
	
}
