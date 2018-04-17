#include<stdio.h>
int main(void){
  int n,a[50000],i,j,sa=1000000;
  while(1){
    scanf("%d",&n);
    if(n==0){
      break;
    }
    for(i=0;i<n;i++){
      scanf("%d",&a[i]);
    }
    
    for(i=0;i<n;i++){
      for(j=0;j<n;j++){
	if(i!=j){
	  if(a[i]-a[j]<sa && a[i]-a[j]>=0){

	    sa=a[i]-a[j];
	  }
	  else if(a[j]-a[i]<sa && a[j]-a[i]>=0){
	    sa=a[j]-a[i];

	  }
	}
      }
    }
    printf("%d\n",sa);
    sa=1000000;
  }
  return 0;
}
