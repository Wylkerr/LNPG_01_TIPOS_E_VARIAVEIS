#include <stdio.h>

int main(){
	
	int celsius, fahrenheit;
	
	printf("Digite a temperatura em Celsius:");
	scanf("%d", &celsius);
	
	fahrenheit = celsius * 1.8 + 32;
	
	printf("A temperatura convertida para fahrenheit é: %d°\n", fahrenheit);
	
}
