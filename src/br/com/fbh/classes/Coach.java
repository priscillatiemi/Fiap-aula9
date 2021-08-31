package br.com.fbh.classes;

public class Coach extends Atleta {

	//Propriedades
	private String cargo;
		
	//Métodos construtores
	public Coach(String aName, String aBirthDate, String aRegNum, String aCategory, String aPosition, String aTeam, String aCargo) {
		super(aName, aBirthDate, aRegNum, aCategory, aPosition, aTeam);
		this.cargo = aCargo;	

	}

	//Métodos get/set
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	
	//Métodos sobrescritos
	@Override
	public void showData() {
		// TODO Auto-generated method stub
		super.showData();
		System.out.println(this.getCargo());
	}
	
	//Métodos comuns da classe
}
