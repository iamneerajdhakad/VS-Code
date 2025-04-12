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


public:

    string name;
    int rollno;
    float percentage;
    

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

    student(student &obj){
        this->name=obj.name;
        this->rollno=obj.rollno;
        this->percentage=obj.percentage;
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

class Shape{

public:
    int number_of_sides;
    double area;
    string name;

    Shape(){

    }

    Shape(string name){
        this->name = name;
    }

    void print_area(){
        cout<<name<<"'s area : "<<area<<endl;
    }

    void cal_area(double radius){

        area = 3.142 * radius * radius;
    }

    void cal_area(int side){
        area = side*side;
    }

    void cal_area(int l, int b){
        area = l*b;
    }



};



void understand_ploymorphism(){

    Shape circle("circle");
    double radii = 1;
    circle.cal_area(radii);
    circle.print_area();

    Shape square("square");
    int side = 1;
    square.cal_area(side);
    square.print_area();

    Shape rectangle("rectangle");
    int l = 6,b=9;
    rectangle.cal_area(l,b);
    rectangle.print_area();
}


class Complex{

public:
    int real;
    int imaginary;

    Complex(){
        this->real=0;
        this->imaginary=0;
    }

    Complex(int real,int imaginary){
        this->real=real;
        this->imaginary=imaginary;
    }


    Complex operator+(Complex &c){

        return Complex(this->real+c.real,this->imaginary+c.imaginary);

    }

    Complex operator+(int j){
    
        return Complex(this->real+j,this->imaginary+j);

    }

    Complex operator++(){

        return Complex(++this->real,++this->imaginary);
    }

    Complex operator++(int){

        return Complex(this->real++,this->imaginary++);
    }

    void print_number(){
        cout<<this->real<<"+"<<this->imaginary<<"i\n";
    }
};

void playing_with_imaginary_numbers(){

    Complex c1(4,3);
    Complex c2(2,3);
    Complex c3 = c1 + c2;
    c3.print_number();
    int a = 3;
    c3 = c1 + a;
    c2++;
    c2.print_number();



    
}



void operator_overloading(){

   


}


void playing_with_constructors(){

    student raghav("raghav",1062,85);
    student vishrut = raghav;
    vishrut.intro();

}



void virtual_function(){

}


int main(){

    //getting_started_with_oops();

    //learning_Encapsulation();

    //inheritence();

    //understand_ploymorphism();

    //operator_overloading();

   
    //playing_with_constructors();

    // playing_with_imaginary_numbers();

    virtual_function();

}