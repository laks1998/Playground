#include<stdio.h>
#include<string.h>
int main() {
	// your code goes here
	
	char a[50],temp;
	scanf("%s",a);
	int c=0,i;
if(strlen(a)>=20){
  printf("Invalid Input");
}
  else{
    for(i=0;a[i]!='\0';){
  c=0;
      temp=a[i];
      printf("%c",temp);
      while(a[i]==temp){
        c++;
        i++;
      }
      printf("%d",c);
    }
  }
  return 0;
}
