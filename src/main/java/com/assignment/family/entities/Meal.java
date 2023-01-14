package com.assignment.family.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "meal")
public class Meal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "invented")
	private Date invented;
	
	
	@ManyToMany(mappedBy = "meals")
	private List<Child> child;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getInvented() {
		return invented;
	}


	public void setInvented(Date invented) {
		this.invented = invented;
	}


	public List<Child> getChild() {
		return child;
	}


	public void setChild(List<Child> child) {
		this.child = child;
	}


	@Override
	public String toString() {
		return "Meal [id=" + id + ", name=" + name + ", invented=" + invented + ", child=" + child + "]";
	}
	
	
}
