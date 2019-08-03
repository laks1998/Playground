#include<stdio.h>
int main()
{
  //Type your code here
  int n,m,t,sum=0;
  scanf("%d",&n);
  m=n/10;
  t=n%10;
  sum=m+t;
  printf("%d",sum);
  return 0;
}