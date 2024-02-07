#include <stdio.h>

int main(){
	
	float n1,p1,n2,p2,n3,p3,media;
	
	printf("Digite a 1º nota: ");
	scanf("%f", &n1);
	printf("Diigite o peso da nota: ");
	scanf("%f", &p1);
	
	printf("Digite a 2º nota: ");
	scanf("%f", &n2);
	printf("Diigite o peso da nota: ");
	scanf("%f", &p2);
	
	printf("Digite a 3º nota: ");
	scanf("%f", &n3);
	printf("Diigite o peso da nota: ");
	scanf("%f", &p3);
	
	media = (n1*p1+n2*p2+n3*p3)/(p1+p2+p3);
	
	printf("Sua média é: %.2f",media);
	
}
