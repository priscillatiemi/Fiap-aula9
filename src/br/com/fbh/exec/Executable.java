package br.com.fbh.exec;

import br.com.fbh.classes.Arbitratian;
import br.com.fbh.classes.Atleta;
import br.com.fbh.classes.Coach;
import br.com.fbh.classes.Member;

public class Executable {

	//Propriedades em forma de instâncias
	static Member member1 = new Member("Priscilla", "23/02/1996", "13212312");
	static Atleta atleta1 = new Atleta("Guilherme", "29/11/1996", "12123123", "Skate", "Ouro", "Skaters");
	static Arbitratian arb1 = new Arbitratian("Sergio", "25/09/1989", "423441", "A", "Cronometragem", "São Paulo");
	static Coach coach = new Coach("Fabiano", "15/07/1999", "312311", "Master", "Técnico", "Futs", "Técnico");
	
	public static void main(String[] args) {

		member1.showData();
		atleta1.showData();
		atleta1.greet();
		arb1.showData();
		coach.showData();
		
		
		
		
	}

}
