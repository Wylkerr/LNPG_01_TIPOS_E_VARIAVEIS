import java.util.Scanner;

public class mediaJ {
    
    public static void main(String[] args) {
        
        try(Scanner digito = new Scanner(System.in)){

            System.out.print("\nDigite sua 1º nota: ");
            float nota1 = digito.nextFloat();
            System.out.print("Digite o peso da 1º nota: ");
            float peso1 = digito.nextFloat();

            System.out.print("\nDigite sua 2º nota: ");
            float nota2 = digito.nextFloat();
            System.out.print("Digite o peso da 2º nota: ");
            float peso2 = digito.nextFloat();

            System.out.print("\nDigite sua 3º nota: ");
            float nota3 = digito.nextFloat();
            System.out.print("Digite o peso da 3º nota: ");
            float peso3 = digito.nextFloat();

            float media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

            System.out.printf("\nSua média é: %.2f\n\n", media);

        }catch (Exception e){

        }

    }

}
