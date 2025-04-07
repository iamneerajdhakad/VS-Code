#include<iostream>
#include<vector>
using namespace std;

union student{
    int  rollno;
    char c;
};

void learning_union(){
    union student obj1;
    obj1.rollno = 326;

}

int main(){

    int n = 1;

    cout<<3*n<<endl<<n++;

}