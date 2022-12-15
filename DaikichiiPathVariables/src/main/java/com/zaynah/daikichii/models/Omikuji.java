package com.zaynah.daikichii.models;

public class Omikuji {
	private int number;
	private String city;
	private String celebrity;
	private String profession;
	private String biotic;
	private String compliment;

    // CONSTRUCTOR
    public Omikuji(int number, String city, String celebrity, String profession, String biotic, String compliment) {
        this.number = number;
        this.city = city;
        this.celebrity = celebrity;
        this.profession = profession;
        this.biotic = biotic;
        this.compliment = compliment;
        
    }

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCelebrity() {
		return celebrity;
	}

	public void setCelebrity(String celebrity) {
		this.celebrity = celebrity;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getBiotic() {
		return biotic;
	}

	public void setBiotic(String biotic) {
		this.biotic = biotic;
	}

	public String getCompliment() {
		return compliment;
	}

	public void setCompliment(String compliment) {
		this.compliment = compliment;
	}

}
