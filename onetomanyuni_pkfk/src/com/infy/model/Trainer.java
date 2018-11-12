package com.infy.model;
import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.Set;
@Entity
@Table(name = "R_TRAINER")
public class Trainer {
	@Id
	@GeneratedValue
	@Column(name = "TRAINER_ID")
	int id;
	@Column(name="TRAINER_NAME")
	String name;
	// collection for Batch
	@OneToMany(cascade = CascadeType.ALL)	
	// This will create a extra column 
	//inside Batch Table telling that this entity makes the association
	@JoinColumn(name="TRAINER_ID")
	Set<Batch> batches;
	  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Set<Batch> getBatches() {
		return batches;
	}
	
	public void setBatches(Set<Batch> batches) {
		this.batches = batches;
	}
	public Trainer() {
		// TODO Auto-generated constructor stub
	}
	public Trainer(String name, Set<Batch> batches) {
		super();
		this.name = name;
		this.batches = batches;
	}
	public Trainer(String name) {
		super();
		this.name = name;
	}
	


}
