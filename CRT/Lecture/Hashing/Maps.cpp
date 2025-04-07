#include<iostream>
#include<vector>
#include<map>
#include<unordered_map>
using namespace std;

void print_map(unordered_map<int, int> &map1){

    //unordered_map<int ,int>::iterator itr;

    // for(itr = map1.begin(); itr != map1.end(); itr++){

    //     cout<<itr->first<<" : "<<itr->second<<endl;
    // }
    
    for(pair<int,int> current_pair : map1){

        int key = current_pair.first;
        int value = current_pair.second;

        cout<<key<<":"<<value<<endl;

    }
}



int main(){

    unordered_map<int,int> int_mapping;

    
    int_mapping[2]=3;
    int_mapping[3]=4;
    int_mapping[1]=2;

    print_map(int_mapping);





}