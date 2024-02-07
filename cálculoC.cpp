#include <stdio.h>

int main(){
	
	int num1, num2, soma, sub, mult, div;
	
	
	printf("Digite um número:\n");
	scanf("%d", &num1);
	
	printf("Digite outro número:\n");
	scanf("%d", &num2);
	
	soma = num1 + num2;
	sub = num1 - num2;
	mult = num1 * num2;
	div = num1 / num2;
	
	printf("SOMA: %d.\nSUBTRAÇÃO: %d\nMULTIPLICAÇÃO: %d\nDIVISÃO: %d\n",soma, sub, mult, div);
	
}
