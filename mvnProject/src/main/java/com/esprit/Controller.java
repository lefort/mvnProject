package com.esprit;

public class Controller {
	private String nom;
	private String prenom;
	private Integer age;

	public Controller() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Hello world !");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
