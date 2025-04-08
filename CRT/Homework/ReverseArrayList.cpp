#include<iostream>
#include<vector>

using namespace std;

void revserse(vector<int> &v){
    int i = 0, n = v.size()-1;
    
    while(i<n){
        int temp = v[i];
        v[i] = v[n];
        v[n]=temp;
        i++;
        n--;
    }

    
}

void print_vec(vector<int> v){

    for(int i = 0; i< v.size(); i++ ){
        cout<<v[i]<<" ";
    }

}

int main(){

    vector<int> v = {1,2,3,4,5,6};
    revserse(v);
    print_vec(v);


}


