public class OperatorsExercise{

/*
   >>> Operadores aritméticos ----------------------------------------------------------------------------------------------
*/

/*
int i = ++k // i=k+1
int j = k-- // j=k ; k=k-1
float f = 1.5f + 4.5f
long l = 10398L * 5L;
double d = 45d / 4d;
double d = f;
int k = 15 % 4;
i+=5  =>  i=i+5;
j-=3  =>  j=j-3;
d/=2.7d  => d=d/2.7d;
i*=3  =>  i=i*3;
k%=2  =>  k=k%2;
*/

/*

Precedências:

Pós-fixados: d++; d--
Pré-fixados: ++z; --z
Multiplicativo: *, /, %
Aditivo: +, -
Atribuição: =, +=, -=, *=, /=, %=

*/


/*
    >>> Operadores Relacionais ---------------------------------------------------------------------------------------------

Conceituação: São simbolos especiais quais são capazes de realizar operações sobre determinados operandos e, em seguida, retornar um resultado (retorno lógico - verdadeiro/falso - true/false).

Tipos: 

Similaridade: igual, diferente
Comparação/Tamanho: maior que, maior que ou igual a, menor que, menor que ou igual a.


   >>> Operadores Lógicos --------------------------------------------------------------------------------------------------

Conceituação: São símbolos especiais quais são capazer de realizar comparações lógicas entre operandos lógicos ou expressões e, em seguida, retornar um resultado.

Tipos:

- Conjunção  ( AND/E - &&)
- Disjunção  ( OR/OU - ||)
- Disjunção Exclusiva  (XOR/OU EXCLUSIVO - ^)
- Negação  (NOT/NÃO - !)


  >>> Estruturas de Controle de Fluxo

Conceituação: São estruturas que têm a capacidade de direcionar o fluxo de execução do código.

Tipos:

Decisão: if, if-else, if-else-if, switch e operador ternário.
Repetição: for, while, do-while
Interrupção: break, continue e return.

*/


// Exercícios --------------------------------------------------------------------------------------------------------------

/*

Criar um simples projeto no Intellij e criar variáveis e expressões para usar nas estruturas if e switch.

a) Com if, exiba o nome do mês do ano de acordo com o seu número. Evite o "efeito flecha". 

variável inteira numMesDoAno

int numMesDoAno = 3;
        if(numMesDoAno==1){
            System.out.println("Janeiro");
        } else if (numMesDoAno==2){
            System.out.println("Fevereiro");
        } else if (numMesDoAno==3){
            System.out.println("Março");
        } else {
            return;
        }


b) Faça também outro if que verifique se o mês é julho, dezembro ou janeiro, para assim exibir o texto "Férias".

String mesDoAno;
if (mesDoAno == "janeiro" || mesDoAno == "dezembro" || mesDoAno == "julho"){
    System.out.println("Férias!");
}

Com switch use String para a partir do dia da semana, exibir seu número. Ainda no switch, faça outro exemplo onde, se uma variável inteira for entre 1 e 3 exibir o texto "Certo". Se for 4 exibir "Errado", se for 5 "Talvez". Pra demais valores exibir "Valor Indefinido".



*/

    public static void main(String[]args){
        
        String mesDoAno = "dezembro";
        if (mesDoAno == "janeiro" || mesDoAno == "dezembro" || mesDoAno == "julho"){
            System.out.println("Férias!");
        }
        
        
        int numMesDoAno = 2;
        if(numMesDoAno==1){
            System.out.println("Janeiro");
        } else if (numMesDoAno==2){
            System.out.println("Fevereiro");
        } else if (numMesDoAno==3){
            System.out.println("Março");
        } else {
            return;
        }

    }

}
