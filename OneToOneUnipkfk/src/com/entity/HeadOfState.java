package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
		return "HeadOfState [id=" + id + ", title=" + title + ", name=" + name + "]";
	}
	
}
