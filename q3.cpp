// Find the max and min element in an array
#include<bits/stdc++.h>
using namespace std;

int main() {
    int ar [] = {23,232, 43, 2921, 873, 982};
    int mx = INT_MIN;
    int mn = INT_MAX;

    for(int i = 0; i < 6; i++){
        mx = max(ar[i], mx);
        mn = min(ar[i], mn);    
    }

    cout<< mx << endl << mn;
    return 0;
}