import java.util.Scanner;

public class lerNot{

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua nota e verifique se ela foi boa ou ruim: ");
        char nota = scanner.next().Uppercase().charAt(0);

        switch (nota) {
            case 'A':
                System.out.println("Excelente");
                break;
            case 'B':
                System.out.println("Boa");
                break;
            case 'C':
                System.out.println("Mediana");   
                break;
            case 'D':
                System.out.println("Ruim");
                break;
            case 'E':
                System.out.println("Reprovado");  
                break;           
        }
    scanner.close();
}
}