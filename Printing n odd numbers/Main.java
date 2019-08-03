#include <stdio.h>
int main() {
	//Type your code
  int n,i=1,count=0;
  scanf("%d",&n);
  do{
    printf("%d \n",i);
    i=i+2;
    count++;
  }while(count<n);
	return 0;
}