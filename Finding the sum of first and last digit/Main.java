#include <stdio.h>
int main() {
	//Type your code
  int n,fn,ln,sum=0;
  scanf("%d",&n);
  ln=n%10;
  fn=n;
  while(fn>=10){
    fn/=10;
  }
  sum=fn+ln;
  printf("%d",sum);
	return 0;
}