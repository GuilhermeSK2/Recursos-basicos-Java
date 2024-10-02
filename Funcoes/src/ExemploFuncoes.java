public class ExemploFuncoes {
    public static void main (String[] args) {
        sum(15, 5); //Argumentos
    }

    static void sum (int number1, int number2) {
        //static void --> Declaracao padrao
        //sum --> Nome da funcao, geralmente usamos verbos para definir o que e a funcao
        // () --> Parenteses (parâmetros) usamos para definir o que chegará naquela funcao Ex. (tipo nomeDaFuncao)
        // {} --> Bloco de codigo que sera executado

        System.out.println(number1 + number2);
    }
}
