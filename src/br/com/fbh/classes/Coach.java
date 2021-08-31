package br.com.fbh.classes;

public class Coach extends Atleta {

	//Propriedades
	private String cargo;
		
	//M�todos construtores
	public Coach(String aName, String aBirthDate, String aRegNum, String aCategory, String aPosition, String aTeam, String aCargo) {
		super(aName, aBirthDate, aRegNum, aCategory, aPosition, aTeam);
		this.cargo = aCargo;	

	}

	//M�todos get/set
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	
	//M�todos sobrescritos
	@Override
	public void showData() {
		// TODO Auto-generated method stub
		super.showData();
		System.out.println(this.getCargo());
	}
	
	//M�todos comuns da classe
}
