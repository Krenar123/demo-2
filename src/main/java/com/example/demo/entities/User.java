package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="student")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    
    @Column(name="name")
    private String name;
    
    
    @Column(name="email")
    private String email;
    
    @Column(name="tel")
    private int phone;
    
    @Column(name="adresa")
    private String adresa;

    public User() {}

    public User(String name, String email,int phone,String adresa) {
        this.name = name;
        this.email = email;
        this.setPhone(phone);
        this.setAdresa(adresa);
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

    public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	@Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", email=" + email + "phone=" + phone + "adresa="+ adresa +'}';
    }

	
}