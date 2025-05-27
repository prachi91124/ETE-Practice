// Find the Sum of Elements of an Array between 2 given indices
#include<bits/stdc++.h>
using namespace std;

int main() {
    int ar[] = {2,39,9,10,92,9,67,28,91};

    int i1 = 4; 
    int i2 =8;

    int sum = 0;
    for(int i = i1; i <= i2; i++){
        sum += ar[i];
    }

    cout << sum;
    return 0;
}