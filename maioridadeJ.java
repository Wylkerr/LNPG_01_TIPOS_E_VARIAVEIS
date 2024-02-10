import java.util.Scanner;

public class maioridadeJ {
    
public static void main(String[] args) {
    
    try(Scanner digito = new Scanner(System.in)){   

        System.out.print("\nDigite sua idade: ");
        int idade = digito.nextInt();

        if(idade >= 21){

            System.out.printf("\nVocê já é maior de idade.\n\n");

        }else{

            System.out.printf("\nVocê ainda é menor de idade.\n\n");

        }

    }catch (Exception e){

    }

}

}
