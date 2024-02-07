#include <stdio.h>

int main(){
	
	int idade;
	
	printf("Digite sua idade: ");
	scanf("%d", &idade);
	
	if(idade >= 21){
		printf("\nVocê já alcançou a maioridade.\n");
	}
	else{
		printf("\nVocê ainda não alcaçou a maioridade.\n");
	}
}

