package br.com.fbh.classes;


public class Arbitratian extends Member {

	//Propriedades
	private String level;
	private String function;
	private String entity;
	
	//Métodos construtores
	public Arbitratian(String aName, String aBirthDate, String aRegNum, String aLevel, String aFunction, String aEntity) {
		super(aName, aBirthDate, aRegNum);
		this.level = aLevel;
		this.function = aFunction;
		this.entity = aEntity;
			
	}

	//Métodos get/set
	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}
	
	
	//Métodos sobrescritos
	@Override
	public void showData() {
		// TODO Auto-generated method stub
		super.showData();
		System.out.println(this.getEntity());
		System.out.println(this.getFunction());
		System.out.println(this.getLevel());
	}
	
	//Métodos comuns da classe

}
