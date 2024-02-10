import java.util.Scanner;
public class temperaturaJ {
    
public static void main(String[] args) {
        
    try(Scanner digito = new Scanner(System.in)){
        
        System.out.print("\nDigite a temperatura em Celsius: ");
        float celsius = digito.nextFloat();

        float fahrenheit = (float) (celsius * 1.8 + 32);

        System.out.printf("\nA temperatura convertida em Fahrenheit é: %.2f\n\n", fahrenheit);



    }catch (Exception e){

}   
    

}


}
