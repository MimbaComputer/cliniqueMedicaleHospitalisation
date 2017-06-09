package org.mimba.bao.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Hospitalisation implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "idPatient")
	private Patient patient;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "idSalle")
	// @JoinTable(name = "HOSP_SALL", joinColumns = @JoinColumn(name =
	// "NUM_HOSP"), inverseJoinColumns = @JoinColumn(name = "NUM_SALL"))
	private Salle salle;
	@NotNull
	@DateTimeFormat(pattern = "yyyy-mm-dd hh:nn")
	private Date date;

	public Hospitalisation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hospitalisation(Patient patient, Salle salle, Date date) {
		super();
		this.patient = patient;
		this.salle = salle;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}

@Entity
class Patient implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToMany(mappedBy = "patient")
	private Collection<Hospitalisation> hospitalisation;
}