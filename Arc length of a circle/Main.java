#include<stdio.h>
int main(){
  float r,o,l;
  scanf("%f %f",&r,&o);
  l=(2*3.14*r)*(o/360);
  printf("%.2f",l);
  return 0;
}