#include <stdio.h>
int main() {
	//Type your code
  int n,i=1,fact=1;
  scanf("%d",&n);
  while(i<=n){
    fact=fact*i;
    i++;
  }
  printf("%d",fact);
  
	return 0;
}