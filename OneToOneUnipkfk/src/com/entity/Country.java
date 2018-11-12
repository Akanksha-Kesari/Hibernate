package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="V1_Country")
public class Country {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="hosid")
	HeadOfState hos;
	public Country( String name, HeadOfState hos) {
		super();

		this.name = name;
		this.hos = hos;
	}
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
	public HeadOfState getHos() {
		return hos;
	}
	public void setHos(HeadOfState hos) {
		this.hos = hos;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", hos=" + hos + "]";
	}
	
	

}
