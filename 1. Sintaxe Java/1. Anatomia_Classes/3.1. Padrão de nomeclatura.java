// OBS: 
//    Este é um arquivo de anotação sobre algumas informações a respeito da linguagem java.
//    Devido a isso, o mesmo não seguirá boas praticas.


// Minha Classe
public class 3.1. Padrão de nomeclatura {
    
    //Método executável
    public static void main (String [] args) {
        System.out.print ( "Olá turma, sejam bem-vindos" ); // Comando para imprimir na tela


            //  Palavra "final":

        //  Quando usada na definição de uma variável, significa que a variável não pode assumir outro valor, tornando-se uma constante.
            final String BR = "Brasil";
        //  Quando usada na definição de um método, significa que o método não poderá ser sobrescrito.
            public class MyClass {
                public final void foo() {}
            }

            public class MyOtherClass extends MyClass {
                public void foo() {} // Não é permitido sobrescrever o método
            }
        //  Quando usada na definição de uma classe, significa que a classe não vai admitir herança.
            public final class MyClass {}
            // Isso não é permitido
            public class MyOtherClass extends MyClass {}
        

            //  Nome de variável:
        //  toda variável deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra da segunda 
        //  palavra deverá ser MAIÚSCULA
            String BR = "Brasil"
            double PI = 3.14
            int ESTADOS_BRASILEIRO = 27
            int ANO_2000 = 2000
    }

    // arquivo CalculadoraCientifica.java
    public class CalculadoraCientifica {
        // A classe deve possuir o mesmo nome do arquivo.java.
    }
}   
