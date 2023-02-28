### Documentação
Uma das maiores características da linguagem Java é que, desde suas primeiras versões, tínhamos em nossas mãos, uma documentação rica e detalhada dos recursos da linguagem.

Conforme site oficial, podemos compreender e explorar, todos os recursos organizados por pacotes e classes bem específicas, sem nem mesmo escrever uma linha de código.

Hoje, costuma-se afirmar que, para se tornar um desenvolvedor nível avançado, é um requisito imprescindível adquirir a habilidade de compreender, a documentação oficial da linguagem e dos frameworks que são incorporados nos projetos atuais.

Aqui, temos o link da documentação de uma das principais classes da linguagem Java:

<a href="https://docs.oracle.com/javase/7/docs/api/java/lang/String.html" data-rnwi-u529wo-aq1qub-c1zw6o-1khlhp8-1cut0bx-na6qhi--hover="true" data-rnwi--1tgwseu--focus="true" data-rnwi-5xr8s6-dse9kg-2fw26j-15n4387-focus-visible="true" data-rnwi-handle="BaseCard" class="css-175oi2r r-lrvibr r-1loqt21 r-1otgn73 r-190qawg r-z2wwpe r-rs99b7 r-1udh08x r-1clhhh9 r-18u37iz r-1awozwy r-nsbfu8" style="background-color: rgb(255, 255, 255); transition-duration: 0.15s;"><div class="css-175oi2r r-88pszg"><img alt="" src="https://docs.oracle.com/favicon.ico" decoding="async" data-rnwibasecard--1ghhsy9-hover="true" data-rnwi-handle="nearest" class="r-1rasi3h" style="width: 32px; height: 32px; border-radius: 4px;"></div><div class="css-175oi2r r-1ro0kt6 r-16y2uox r-1wbh5a2"><div class="css-175oi2r r-18u37iz r-1awozwy"><div dir="auto" data-rnwibasecard--1ghhsy9-hover-focus="true" data-rnwi-handle="nearest" class="css-1rynq56 r-dnmrzs r-1udh08x r-1udbk01 r-3s2u2q r-1iln25a r-gg6oyi r-ubezar r-135wba7 r-majxgm r-1nf4jbm">String (Java Platform SE 7 )</div></div></div></a>

### Tags
Mas e quais as informações, que obtemos através de classes documentadas, na linguagem ? Java Documentation é composto por tags que, representam dados relevantes para a compreensão da proposta de uma classe e os conjuntos de seus métodos e atributos conforme tabela abaixo:

| Tag | Descrição |
|    :----:   |    :----:   |
| @autor | Autor / Criador |
| @version | Versão do recurso disponibilizado |
| @since | Versão / Data de início da disponibilização do recurso |
| @param | Descrição dos parâmetros dos métodos criados |
| @return | Definição do tipo de retorno de um método |
| @throws | Se o método lança alguma exceção |

Abaixo, iremos ilustrar a classe Calculadora com um exemplo de documentação, destacando as **tags** mais utilizadas:

```
/**
* <h1>Calculadora</h1>
* A Calculadora realiza operações matemáticas entre números inteiros
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Gleyson Sampaio
* @version 1.0
* @since   01/01/2022
*/
public class Calculadora {
    /**
   * Este método é utilizado para somar dois números inteiros
   * @param numeroUm este é o primeiro parâmetro do método
   * @param numeroDois este é o segundo parâmetro do método
   * @return int o resultado deste método é a soma dos dois números.
   */
    public int somar(int numeroUm, int numeroDois) {
        return  numeroUm + numeroDois;
    }
}
```
![]](https://tinyurl.com/3n4dunjw)

### Tipos de comentários
**One Line**
```
// Olá, eu sou um comentário em uma única linha
```
**Mult Line**
```
/* Olá,
 * Eu sou um comentario
 * que posso ser mais detalhadod
 * quando necessário
 */
```
**Documentation**
```
/** 
 * Estas duas estrelinhas acima
 * é para identificar que você
 * pretende elaborar um comentário
 * a nível de documentação.
 * Que incrível !!!
 */
```
>	:warning:
>Um comentário, não possui a finalidade de **amenizar** um algoritmo não estruturado, conforme as convenções da linguagem.

```
/*
 * Este método foi elaborado as pressas
 * por isso eu abrevei o nome das variáveis
 * mas olha, ele tem a finalidade de somar ou  multiplicar
 * dois números
 * /
public int somaMultiplica (int n, int x, String m){
    int r = 0; // r é igual ao resultado
    if (m == "M"){ // M= multiplicação
        r= n * x;
    }else{
        // se não soma mesmo
        r = n + x
    }
    return r;
}
```

### Javadoc
**Javadoc** é um gerador de documentação criado pela Sun Microsystems , para documentar a API dos programas em Java, a partir do código-fonte. O resultado é expresso em HTML. É constituído, basicamente, por algumas marcações muitos simples, inseridas nos comentários do programa.
Este sistema, é o padrão de documentação de classes em Java, onde muitas das IDEs desta linguagem irão automaticamente gerar um Javadoc em HTML.

Criando nossa documentação no formato html, para disponibilizar via web.
```
// No terminal execute o comando abaixo

javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
```