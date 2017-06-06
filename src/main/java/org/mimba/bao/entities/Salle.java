package org.mimba.bao.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Salle implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min = 3, max = 50)
	private String nom;
	@NotNull
	private int capacite;
	@NotNull
	private boolean disponible;
	@Size(min = 3, max = 50)
	private String description;
	@NotNull
	private int contenue;
	@ManyToMany(mappedBy = "salle")
	private Collection<Hospitalisation> hospitalisation;

	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salle(String nom, int capacite, boolean disponible, String description, int contenue) {
		super();
		this.nom = nom;
		this.capacite = capacite;
		this.disponible = disponible;
		this.description = description;
		this.contenue = contenue;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getContenue() {
		return contenue;
	}

	public void setContenue(int contenue) {
		this.contenue = contenue;
	}

	public Collection<Hospitalisation> getHospitalisation() {
		return hospitalisation;
	}

	public void setHospitalisation(Collection<Hospitalisation> hospitalisation) {
		this.hospitalisation = hospitalisation;
	}

}
