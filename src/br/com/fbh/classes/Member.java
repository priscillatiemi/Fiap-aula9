package br.com.fbh.classes;

public class Member {

	
	private String name;
	private String birthDate;
	private String regNumber;
	
	
	public Member(String aName, String aBirthDate, String aRegNum) {
		this.name = aName;
		this.birthDate = aBirthDate;
		this.regNumber = aRegNum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}


	public String getRegNumber() {
		return regNumber;
	}


	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	
	
	
	public void showData() {
		System.out.println();
		System.out.println("Dados de Cadastro: ");
		System.out.println(getName());
		System.out.println(getBirthDate());
		System.out.println(getRegNumber());
	}
}
