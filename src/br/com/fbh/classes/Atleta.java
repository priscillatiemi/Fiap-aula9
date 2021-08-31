package br.com.fbh.classes;


public class Atleta extends Member {

	
	//Propriedades
	private String category;
	private String position;
	private String team;
		
	//Métodos Construtores
	public Atleta(String aName, String aBirthDate, String aRegNum, String aCategory, String aPosition, String aTeam) {
		//Executando o Construtor da superClass
		super(aName, aBirthDate, aRegNum);
		
		//Preenchendo as propriedades locais
		this.category = aCategory;
		this.position = aPosition;
		this.team = aTeam;
	}

	
	//Métodos Get/set
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	
	//Métodos herdados e sobrescritos
	//Override tem como finalidade indicar a sobrescrita 
	//de um método da classe pai.
	@Override
	public void showData() {
		// TODO Auto-generated method stub
		super.showData();
		System.out.println("Dados atleta: ");
		System.out.println(this.getCategory());
		System.out.println(this.getPosition());
		System.out.println(this.getTeam());
	}
	
	public void greet() {
		System.out.println("Olá");
	}
	
	
}
