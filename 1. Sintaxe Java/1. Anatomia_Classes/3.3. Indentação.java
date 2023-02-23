// OBS: 
//    Este é um arquivo de anotação sobre algumas informações a respeito da linguagem java.
//    Devido a isso, o mesmo não seguirá boas praticas.


public class 3.3. Indentação {
    //  Sem Indentação
    public static void main(String[] args) {
    int mediaFinal = 6;
    if(mediaFinal<6)	
    System.out.println("REPROVADO"); 
    else if(mediaFinal==6)
    System.out.println("PROVA MINERVA"); 
    else
    System.out.println("APROVADO"); 		
    }

    //  Com Indentação
    public static void main(String[] args) {
		int mediaFinal = 6;
		if (mediaFinal < 6)
			System.out.println("REPROVADO");
		else if (mediaFinal == 6)
			System.out.println("PROVA MINERVA");
		else
			System.out.println("APROVADO");
	}

}
