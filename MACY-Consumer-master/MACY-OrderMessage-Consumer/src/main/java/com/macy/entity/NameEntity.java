package com.macy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NAME")
public class NameEntity {

	@Id
	@GeneratedValue
	@Column(name = "nameId")
	public int nameId;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "seperatorName0")
	private int seperatorName0;
	
	@Column(name = "seperatorName1")
	private int seperatorName1;

	public NameEntity() {
	}

	public NameEntity(int nameId, String firstName, String lastName, int seperatorName0, int seperatorName1) {
		super();
		this.nameId = nameId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.seperatorName0 = seperatorName0;
		this.seperatorName1 = seperatorName1;
	}

	public int getNameId() {
		return nameId;
	}

	public void setNameId(int nameId) {
		this.nameId = nameId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSeperatorName0() {
		return seperatorName0;
	}

	public void setSeperatorName0(int seperatorName0) {
		this.seperatorName0 = seperatorName0;
	}

	public int getSeperatorName1() {
		return seperatorName1;
	}

	public void setSeperatorName1(int seperatorName1) {
		this.seperatorName1 = seperatorName1;
	}

	@Override
	public String toString() {
		return "NameEntity [nameId=" + nameId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", seperatorName0=" + seperatorName0 + ", seperatorName1=" + seperatorName1 + "]";
	}
}
