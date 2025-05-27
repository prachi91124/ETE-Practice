#include<bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;

    vector <string> li;
    for(int i = 0; i < t; i ++){
        string s;
        cin >> s;
        li.push_back(s);
    }

    int mxl = INT_MIN;
    for(string s : li){
        int l = s.size();
        mxl = max(mxl,l);
    }

    for(string s : li){
        if(s.size() == mxl){
            cout << s;
            break;
        }
    }

    return 0;
}