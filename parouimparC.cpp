#include <stdio.h>

int main(){
	
	int num;
	
	printf("Digite um n�mero inteiro:\n");
	scanf("%d", &num);
	
	if(num % 2 == 0){
		printf("O n�mero %d � par", num);
	}
	else{
		printf("O n�mero %d � �mpar", num);
	}
		
		
}
