#include<iostream>
#include <vector>
using namespace std;
#define forn(i,n)   for(int i = 0; i<n; i++)

void print_vec(vector<int> v){

    for(int  x : v){
        cout<<x;
    }

}

int main(){
    int n = 5;

    int a[n];
    vector<int> v;

    for(int i = 0; i < n; i++){
        a[i] = i+1;
        v.push_back(i+1);
    }

    print_vec(v);

    return 0;
}