#include<stdio.h>
int main()
{
  //Type your code here
  int n,t,m,sum=0;
  scanf("%d",&n);
  t=n/100;
  m=n%10;
  sum=t+m;
  printf("%d",sum);
  return 0;
}