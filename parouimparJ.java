import java.util.Scanner;
public class parouimparJ {
    
public static void main(String[] args) {
    
    try(Scanner digito = new Scanner(System.in)) {
        
        System.out.print("\nDigite um número inteiro: ");
        int n1 = digito.nextInt();

        int par = n1 % 2;

        if (par == 0){
                
            System.out.printf("\nO número %d é par\n\n", n1);

        }
        
        else{

            System.out.printf("\nO número %d é ímpar\n\n", n1);
        
        }
}   

    catch (Exception e) {

    }

}

}
