#include <stdio.h>

int main(){
	
	int idade;
	
	printf("Digite sua idade: ");
	scanf("%d", &idade);
	
	if(idade >= 21){
		printf("\nVoc� j� alcan�ou a maioridade.\n");
	}
	else{
		printf("\nVoc� ainda n�o alca�ou a maioridade.\n");
	}
}

