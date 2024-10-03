import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String password = "123456";
        System.out.println("DIgite a sua senha");

        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        // == não compara o conteudo, ele compara a referência dos objetos.
        System.out.println(password.equals(pass));

        /*
        String x = new String ("123456"); // Está em um espaço de memória
        String y = new String ("123456"); // Está em um outro espaço de memória
        */

        String x = "123456"; // 00010
        String y = "123456"; // 00010
        System.out.println(x == y); // == deve ser utilizado para comparar referências e não o conteúdo
    }
}
