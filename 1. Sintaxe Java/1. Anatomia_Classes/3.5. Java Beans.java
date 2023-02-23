// OBS: 
//    Este é um arquivo de anotação sobre algumas informações a respeito da linguagem java.
//    Devido a isso, o mesmo não seguirá boas praticas.


public class 3.5. Java Beans {

    public static void main (String [] args) {

        //  Algumas sugestões de nomenclatura:
        //      - Uma variável deve ser clara, sem abreviações ou definição sem sentido;
        //      - Uma variável é sempre no singular, exceto quando se referir a um array ou coleção.
        //      - Defina um idioma único para suas variáveis. Se você for declarar variáveis em inglês, defina todas em inglês.


        // NÃO RECOMENDADO:
        double salMedio = 1500.23  //variável abreviada, o que dificulta a compreensão
        String emails = "aluno@escola.com" //confuso se a variável seria um array ou único e-mail
        String myName = "JOSEPH" //se idioma pt-BR, o valor poder ser de outro idioma mas o nome da variável não 
    
        //  RECOMENDADO:
        double salarioMedio=1500.23;
        String email ="aluno@escola.com";
        String [] emails = {"aluno@escola.com","professor@escola.com"}
        String meuNome = "JOSEPH" 
    }
}
