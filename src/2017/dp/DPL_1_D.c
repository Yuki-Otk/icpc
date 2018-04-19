#include<stdio.h>
int dp[100000]={};
int main(void){
    int num;
    int data[100000];
    scanf("%d",&num);
    for(int i=0;i<num;i++){
        scanf("%d",&data[i]);
        int j=i;
        while(1){
            if(j==1){
                dp[i]=1;
                break;
            }
            if(data[i]>data[j-1]){
                dp[i]=data[j-1]+1;
            }
            j--;
            
        }
    }
    int max=dp[0];
    for(int i=1;i<num;i++){
        if(max<dp[i]){
            max=dp[i];
        }
    }
    printf("%d\n",max);
    return 0;
}