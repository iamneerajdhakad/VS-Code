#include<iostream>
#include<vector>
#include<map>
#include<unordered_map>
using namespace std;

void print_map(unordered_map<string,vector<string>> &Crush){

    
    for(pair<string,vector<string>> current_pair : Crush){

        string key = current_pair.first;
        cout<<key<<" : ";
        for(auto s : current_pair.second){
            cout<<s<<" ";
        }
        cout<<endl;

    }
}



int main(){

   

    vector<string> ladies = {"Dhriti","lakshya","kushi","khushboo"};
    unordered_map<string,vector<string>> Crush;

    Crush["Shreyansh"]={"lakshya"};
    Crush["Pradyuman"]={"Dhriti"};
    Crush["Kartikeya"]={"Dhriti","kushi","khushboo"};
    Crush["Arya"]={"lakshya"};

    print_map(Crush);





}