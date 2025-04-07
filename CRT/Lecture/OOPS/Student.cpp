#include<iostream>
#include<string>
using namespace std;

class human {

public:
    string name;
    int age;

    void breath(){
        cout<<name<<" is Breathing";
    }


};

class student:public human{

private:
    float percentage;



public:

    string name;
    int rollno;
    

    void  intro(){
        cout<<"Hi, my name is "<<name<<" and My percentage is : "<<percentage<<endl;
    }

    void getPercentage(){
        cout<<percentage;
    }

    void setPercentage(float percentage){
        this->percentage=percentage;
    }


    void breath(){
        cout<<"Jinda Hai Bas";
    }
    

    student(){
        
    }

    student(string name, int rollno, float percentage){

        this->name=name;
        this->rollno=rollno;
        this->percentage=percentage;
    }


};



void getting_started_with_oops(){

    // new keyword creates a pointer 
    student *neeraj = new student();
    neeraj->name = "neeraj";
    neeraj->rollno=1157;
    //neeraj->percentage=80.7f;
    neeraj->intro();


    // 
    student mayank("mayank",1090,98.7);
    // mayank.name = "mayank";
    // mayank.rollno = 1090;
    // mayank.percentage = 98.7f;
    mayank.intro();

    
}

void learning_Encapsulation(){

    student Shravan("Shravan",1036,92.3f);
    Shravan.intro();
    Shravan.setPercentage(0.0f);
    Shravan.getPercentage();
}


void inheritence(){

    human obj1;
    student paras;

    paras.name="Paras";
    
    paras.breath();

    cout<<paras.name<<endl;


}



int main(){

    //getting_started_with_oops();

    // learning_Encapsulation();

    inheritence();

}