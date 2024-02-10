import java.util.Scanner;

public class calculoJ {

public static void main(String[] args){
    try (Scanner digito = new Scanner(System.in)) {
        
        System.out.print("\nDigite o primeiro número: ");
        int n1 = digito.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = digito.nextInt();

        int soma = n1 + n2;
        int sub = n1 - n2;
        int mult = n1 * n2;
        int div = n1 / n2;

        System.out.printf("\nA soma de %d + %d = %d\n", n1, n2, soma);
        System.out.printf("A subtração de %d - %d = %d\n", n1, n2, sub);
        System.out.printf("A multiplicação de %d * %d = %d\n", n1, n2, mult);
        System.out.printf("A divisão de %d / %d = %d\n", n1, n2, div);

}   catch (Exception e) {
    
}

}
}