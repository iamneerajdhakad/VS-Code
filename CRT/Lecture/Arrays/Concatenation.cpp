#include<iostream>
#include<vector>
using namespace std;

vector<int> getConcatenation(vector<int>& nums) {

    int n = nums.size();

    for(int i = 0; i < n; i++){
        nums.push_back(nums[i]);
    }

    return nums;

    
}

int main(){

}