#include<stdio.h>
int main(void){
  int i=0,n=0,s[26] ={0},max1=0,max2=0,c=0,flag=0;
  char a[1500],name[26]={"ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
  while(1){
    scanf("%d",&n);
    if(n == 0){
      break;
    }
    for(i=0;i<26;i++){
      s[i]  = 0;
    }
    flag=0;
    max1 = 0;
    max2 = 0;
    for(i=0;i<n;i++){
    	scanf(" %c",&a[i]);
    }
    for(i=0;i<n;i++){
      if(a[i] == 'A'){
	s[0]++;
	if(max1 < s[0]){
	  max1 = s[0];
	  c =0;
	}else if( max2 < s[0]){
	  max2 = s[0];
	}
      }else if(a[i] == 'B'){
	s[1]++;
	if(max1 < s[1]){
	  max1 = s[1];
	  c =1;
	}else if( max2 < s[1]){
	  max2 = s[1];
	}
	}else if(a[i] == 'C'){
	s[2]++;
	if(max1 < s[2]){
	  max1 = s[2];
	  c=2;
	}else if( max2 < s[2])
	  max2 = s[2];
      }else if(a[i] == 'D'){
	s[3]++;
	if(max1 < s[3]){
	  max1 = s[3];
	  c=3;
	}else if( max2 < s[3]){
	  max2 = s[3];
	}
      }else if(a[i] == 'E'){
	s[4]++;
	if(max1 < s[4]){
	  max1 = s[4];
	  c = 4;
	}else if( max2 < s[4]){
	  max2 = s[4];
	}
      }else if(a[i] == 'F'){
	s[5]++;
	if(max1 < s[5]){
	  max1 = s[5];
	  c =5;
	}else if( max2 < s[5]){
	  max2 = s[5];
	}
      }else if(a[i] == 'G'){
	s[6]++;
	if(max1 < s[6]){
	  max1 = s[6];
	  c=6;
	}else if( max2 < s[6]){
	  max2 = s[6];
	}
      }else if(a[i] == 'H'){
	s[7]++;
	if(max1 < s[7]){
	  max1 = s[7];
	  c =7;
	}else if( max2 < s[7]){
	  max2 = s[7];
	}
      }else if(a[i] == 'I'){
	s[8]++;
	if(max1 < s[8]){
	  max1 = s[8];
	  c=8;
	}else if( max2 < s[8]){
	  max2 = s[8];
	}
      }else if(a[i] == 'J'){
	s[9]++;
	if(max1 < s[9]){
	  max1 = s[9];
	  c=9;
	}else if( max2 < s[9]){
	  max2 = s[9];
	}
      }else if(a[i] == 'K'){
	s[10]++;
	if(max1 < s[10]){
	  max1 = s[10];
	  c=10;
	}else if( max2 < s[10]){
	  max2 = s[10];
	}
      }else if(a[i] == 'L'){
	s[11]++;
	if(max1 < s[11]){
	  max1 = s[11];
	  c=11;
	}else if( max2 < s[11]){
	  max2 = s[11];
	}
      }else if(a[i] == 'M'){
	s[12]++;
	if(max1 < s[12]){
	  max1 = s[12];
	  c=12;
	}else if( max2 < s[12]){
	  max2 = s[12];
	}
      }else if(a[i] == 'N'){
	s[13]++;
	if(max1 < s[13]){
	  max1 = s[13];
	  c=13;
	}else if( max2 < s[13]){
	  max2 = s[13];
	}
      }else if(a[i] == 'O'){
	s[14]++;
	if(max1 < s[14]){
	  max1 = s[14];
	  c=14;
	}else if( max2 < s[14]){
	  max2 = s[14];
	}
      }else if(a[i] == 'P'){
	s[15]++;
	if(max1 < s[15]){
	  max1 = s[15];
	  c=15;
	}else if( max2 < s[15]){
	  max2 = s[15];
	}
      }else if(a[i] == 'Q'){
	s[16]++;
	if(max1 < s[16]){
	  max1 = s[16];
	  c=16;
	}else if( max2 < s[16]){
	  max2 = s[16];
	}
      }else if(a[i] == 'R'){
	s[17]++;
	if(max1 < s[17]){
	  max1 = s[17];
	  c=17;
	}else if( max2 < s[17]){
	  max2 = s[17];
	}
      }else if(a[i] == 'S'){
	s[18]++;
	if(max1 < s[18]){
	  max1 = s[18];
	  c=18;
	}else if( max2 < s[18]){
	  max2 = s[18];
	}
      }else if(a[i] == 'T'){
	s[19]++;
	if(max1 < s[19]){
	  max1 = s[19];
	  c=19;
	}else if( max2 < s[19]){
	  max2 = s[19];
	}
      }else if(a[i] == 'U'){
	s[20]++;
	if(max1 < s[20]){
	  max1 = s[20];
	  c=20;
	}else if( max2 < s[20]){
	  max2 = s[20];
	}
      }else if(a[i] == 'V'){
	s[21]++;
	if(max1 < s[21]){
	  max1 = s[21];
	  c=21;
	}else if( max2 < s[21]){
	  max2 = s[21];
	}
      }else if(a[i] == 'W'){
	s[22]++;
	if(max1 < s[22]){
	  max1 = s[22];
	  c=22;
	}else if( max2 < s[22]){
	  max2 = s[22];
	}
      }else if(a[i] == 'X'){
	s[23]++;
	if(max1 < s[23]){
	  max1 = s[23];
	  c=23;
	}else if( max2 < s[23]){
	  max2 = s[23];
	}
      }else if(a[i] == 'Y'){
	s[24]++;
	if(max1 < s[24]){
	  max1 = s[24];
	  c=24;
	}else if( max2 < s[24]){
	  max2 = s[24];
	}
      }else if(a[i] == 'Z'){
	s[25]++;
	if(max1 < s[25]){
	  max1 = s[25];
	  c=25;
	}else if( max2 < s[25]){
	  max2 = s[25];
		}
    }
    if(i+1 > n/2 && max1 > max2 + n-i-1 && i != 0){
    flag=1;
	break;
    }
    }
    if(max1 == max2){
      printf("TIE\n");
    }else if( flag ==1){
      printf("%c %d\n",name[c], i+1);
    }else{
      printf("%c %d\n",name[c], i);
    }
  }
  return 0;
}
