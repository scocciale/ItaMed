package com.entities;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the tabella1 database table.
 * 
 */
@Entity
@NamedQuery(name="Tabella1.findAll", query="SELECT t FROM Tabella1 t")
public class Tabella1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tab1")
	private int idTab1;

	@Column(name="nome_tab1")
	private String nomeTab1;

	public Tabella1() {
	}

	public int getIdTab1() {
		return this.idTab1;
	}

	public void setIdTab1(int idTab1) {
		this.idTab1 = idTab1;
	}

	public String getNomeTab1() {
		return this.nomeTab1;
	}

	public void setNomeTab1(String nomeTab1) {
		this.nomeTab1 = nomeTab1;
	}

}