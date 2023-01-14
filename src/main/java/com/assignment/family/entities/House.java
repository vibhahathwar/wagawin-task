package com.assignment.family.entities;

import com.assignment.family.utilities.HouseType;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "house")
public class House {
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "zipcode")
	private String zipCode;
	
	
	@Column(name = "type")
	@Enumerated(EnumType.STRING)
	private HouseType type;
	
	@JsonBackReference
	@OneToOne
	@JoinColumn(name = "persosn_id")
	@MapsId
	private Person person;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	public HouseType getType() {
		return type;
	}


	public void setType(HouseType type) {
		this.type = type;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}


	@Override
	public String toString() {
		return "House [id=" + id + ", address=" + address + ", zipCode=" + zipCode + ", type=" + type + ", person="
				+ person + "]";
	}



}
