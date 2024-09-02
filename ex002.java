import java.util.Scanner;
public class ex002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insirá uma palavra qualquer: ");
        String palavra = entrada.nextLine().toUpperCase();
        int cont = 0;
        for(int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'A') {
                cont++;
            }
        }
        System.out.printf("A letra A aparece %d vezes", cont);
        entrada.close();
    }
}
