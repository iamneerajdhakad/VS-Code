#include<iostream>
#include<vector>
using namespace std;

#define forn(i,n) for(int i = 0; i < n; i++)

int main(){

    int a[7] = {1,2,3,4,5,-1};

    int *p_a = a;
     p_a+=2;
      p_a+= p_a[-1];

    cout<<*(p_a);


}