#include<stdio.h>
int dp[10000000]={0,1};
int main(void){
	int n;
	scanf("%d",&n);
	for(int i=2;i<n;i++){
		dp[i]=dp[i-1]+dp[i-2];
	}
	printf("%d\n",dp[n-1]);
	return 0;
}