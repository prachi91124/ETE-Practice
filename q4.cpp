// You are given an array find sum of elts of array
#include<bits/stdc++.h>
using namespace std;

int main() {
    int ar[] = {4,5,68,9,29,83,92,9,1};
    int sum = 0;

    for(int i = 0; i < 9; i++){
        sum += ar[i];
    }

    cout << sum;
    return 0;
}