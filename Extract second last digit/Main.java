#include<stdio.h>
int main()
{
  //Type your code here
  int n,m,t;
  scanf("%d",&n);
 if(n>0){
   n=n%100;
   n=n/10;
 }
  printf("%d",n);
     
  return 0;
}