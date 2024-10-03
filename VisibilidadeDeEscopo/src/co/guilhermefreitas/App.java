package co.guilhermefreitas;

public class App {
    //Padrão (default) --> qualquer outro arquivo dentro do mesmo pacote pode acessar essa variavel.
    //Public --> visibilidade para todos os packages.
    //Private --> visibilidade privada para todos os packages.
    public static int z;

    public static void main(String[] args){
        //Visibilidade de escopo
        int x;
        //A variável "int x;" só pode ser vista dentro deste escopo, é uma variável local.
    }

    public static void sum(String[] args){
        //Visibilidade de escopo
        int y;
        //A variável "int y;" só pode ser vista dentro deste escopo, é uma variável local.
    }
}
