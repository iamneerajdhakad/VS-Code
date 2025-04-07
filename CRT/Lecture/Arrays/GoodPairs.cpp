#include<iostream>
#include<vector>
using namespace std;

int main(){

    vector<int> nums = {1,2,3,1,1,3};

    int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
    
    cout<<count;

}