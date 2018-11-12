package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="V1_Hos")
public class HeadOfState {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="h_id")
	int id;
	String title;
	String name;
	@OneToOne(mappedBy="hos1")
	
	Country cont;
	public Country getCont() {
		return cont;
	}
	public void setCont(Country cont) {
		this.cont = cont;
	}
	public HeadOfState( String title, String name) {
		super();
		
		this.title = title;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "HeadOfState [id=" + id + ", title=" + title + ", name=" + name + ", cont=" + cont + "]";
	}
	
	
}
