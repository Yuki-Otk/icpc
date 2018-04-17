#include<stdio.h>
int main(void){
	int z,i,m,n,data[101]={},j=0;
	
	while(1){
		scanf("%d %d",&m,&n);
		if(m==0 && n==0){
			break;
		}
		for(i=0;i<n;i++){
			z=1;
			j=0;
			while(1){
				//printf("data[m+i]%d %d\n",m+i,data[m+i+j]);
				if(data[m+i+j]==1){
					j++;
				}
				else{
					break;
				}
			}
			while((m+i+j)*z<100){
				if(data[(m+i+j)*z]!=1){
					data[(m+i+j)*z]=1;
				//	printf("data%d %d\n",(m+i)*z,data[(m+i)*z]);
				}
				z++;
			}
		}
	/*	for(i=0;i<100;i++){
			printf("data[%d]=%d\n",i,data[i]);
		}*/
		i=m;
		
		while(1){
			//printf("test\n");
			if(data[i]==0){
				break;
			}
			i++;
		}
		printf("%d\n",i);
		for(i=0;i<100;i++){
			//printf("data[%d]=%d\n",i,data[i]);
			data[i]=0;
		}

	}
	return 0;
}