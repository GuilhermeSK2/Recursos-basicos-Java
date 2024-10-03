public class ExemploEscopo {
    public static void main (String[] args) {
        //Escopo de variáveis
        if(true){
            int x = 10; // variavel local
        }
        //System.out.println(x); //não é possível imprimir o valor da variável por ela não estar no mesmo escopo que este comando
        //Para poder acessa-la deveriamos declarar ela dentro do escopo do metodo main o qual o comando println está dentro.
    }
}
