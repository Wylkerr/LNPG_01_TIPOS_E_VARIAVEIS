#include <stdio.h>

int main(){
	
	int num1, num2, soma, sub, mult, div;
	
	
	printf("Digite um n�mero:\n");
	scanf("%d", &num1);
	
	printf("Digite outro n�mero:\n");
	scanf("%d", &num2);
	
	soma = num1 + num2;
	sub = num1 - num2;
	mult = num1 * num2;
	div = num1 / num2;
	
	printf("SOMA: %d.\nSUBTRA��O: %d\nMULTIPLICA��O: %d\nDIVIS�O: %d\n",soma, sub, mult, div);
	
}
