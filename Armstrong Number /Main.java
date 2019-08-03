#include <stdio.h>
int main() {
	//Type your code
  int n,or,rem,res=0,nu=0;
  scanf("%d",&n);
  or=n;
  while(or!=0){
    or/=10;
    ++nu;
  }
  or=n;
  while(or!=0){
    rem=or%10;
    res+=pow(rem,nu);
    or/=10;
  }
  if(res==n)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
    
    
   
  
    
	return 0;
}