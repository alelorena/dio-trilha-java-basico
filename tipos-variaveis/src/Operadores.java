public class Operadores {
                //classe Operadores.java
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
		System.out.println(nomeCompleto);
        //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

/* operadores unários */

        int numero = 5;
        
        System.out.println(- numero);
        System.out.println(numero);

        numero = - numero; 
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

/* incremento */

        int numero2 = 5;
        //x repeticaao
        numero2 = numero2 + 2;

        System.out.println(numero2);

        numero2++;
        System.out.println(numero2);
        System.out.println(++ numero2);
        System.out.println(-- numero2);

        /* negando expressões boleanas */

        boolean variavel = false;

        System.out.println(!variavel);

        System.out.println(variavel);

        variavel = !variavel;

        System.out.println(variavel);

/* operador ternario */

        int a, b;
        a = 6;
        b = 6;
        String resultado = "";
            if(a==b)
                resultado = "verdadeiro";
            else
                resultado = "falso";
        System.out.println(resultado)
        
        /* usando o operador ternário abaixo: */;

        String resultado2 = "";
    
            resultado2 = a==b ?"verdadeiro" : "falso";
        System.out.println("resultado 2: " + (resultado2));

/* operadores relacionais */

        int numero3 = 2;
        int numero4 = 2;

        boolean simNao = numero3 == numero4;

        System.out.println("numeroTres é igual a numeroQuatro? " + simNao);

        simNao = numero3 != numero4;

        System.out.println("numeroTres é diferente do numeroQuatro? " + simNao);

        simNao = numero3 > numero4;

        System.out.println("numeroTres é maior que o numeroQuatro? " + simNao);

        simNao = numero3 < numero4;

        System.out.println("numeroTres é menor que o numeroQuatro? " + simNao);

        if (numero3 == numero4) {

            System.out.println("a nossa condição é verdadeira");
        }
/* comparando dois objetos usando equals */

        String nomeUm = "Alexandre";
        String nomeDois = new String("Alexandre");

        System.out.println(nomeUm.equals(nomeDois));

/* operadores lógicos */

        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && (7 > 4)){
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }

       System.out.println("fim");

    }


}
