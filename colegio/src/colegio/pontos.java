package colegio;

public class pontos {

	
	Double primeirotri;
	Double segundotri;
	Double terceirotri;
	Double notefinal;
	Double percentual;
	Boolean exame;
	String nome;
	
	
	
	
	
	public double primeirosemestre() {
		if ( primeirotri >= 30 ) {
			
			System.out.printf("Parabéns você passou! no primeiro Trimestre você atingiu %.2f", primeirotri);
	}
			else	
				System.out.printf("Infelizmente você não passou no primeiro pois sua nota foi,  %.2f fará exame", primeirotri );
		
		
		
		return primeirotri;
	}
	
	

	public double segundosemetre() {
		if ( segundotri >= 35 ) {
			
			System.out.printf("Parabéns você passou! no segundoo Trimestre você atingiu %.2f", segundotri);
}
			else	
					System.out.printf("Infelizmente você não passou no segundo pois sua nota foi,  %.2f fará exame", segundotri);
		
		
		
		
		
		return segundotri;
	
	}
	
	

	public double terceirosemestre() {
		if ( terceirotri >= 35 ) {
			
			System.out.printf("Parabéns você passou! no terceiro Trimestre você atingiu %.2f", terceirotri);
}
			else	
				System.out.printf("Infelizmente você não passou no segundo pois sua nota foi,  %.2f fará exame", terceirotri);
		
		
		return terceirotri;
	}
	
	
	public double semestrefinal () {
		
		double notefinal = primeirotri+segundotri+terceirotri;
		boolean exame = notefinal <=60; 
		double percentual = (60 - notefinal);
		
		if ( notefinal >= 60) {
			
			System.out.printf("Parabéns você foi aprovado com uma nota total de %.2f", notefinal);
			System.out.println("\r PASS");
		}
		
		
		 else if (notefinal >= 40  ) {
				System.out.printf("\r Olha você teve uma nota abaixo do esperado por isso fará uma atividade compensatória sua nota foi de", exame);
				System.out.printf("\r nota necessária para antigir o mínimo para aprovação seria de %.2f",percentual );
				System.out.println("\r LOADING");

		}
		
		 else if (notefinal <= 59 ) {
				System.out.printf("\r Olha você teve uma nota abaixo do esperado por isso fará uma atividade compensatória sua nota foi de", exame);
				System.out.printf("\r nota necessária para antigir o mínimo para aprovação seria de %.2f",percentual );
				System.out.println("\r PASS");


		}
		 else
		System.out.printf("\r Olha você teve uma nota muito baixa e devido a isso irá refazer o ano", notefinal);
		
		System.out.printf("\r nota necessária para antigir o mínimo para aprovação seria de %.2f",percentual);
		
		System.out.println("\r FAILED");
		return notefinal;

	}
	
	
	
	
	public String nome () {
		
	
		
		

	return nome;	
		
	}
	
	
	
	
}



