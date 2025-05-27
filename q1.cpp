// Declare 2 strings and concatenate them and display concatenated string. Also, display length of string
#include<bits/stdc++.h>
using namespace std;

int main() {
    string s1, s2;
    cin >> s1 >> s2;

    string s3 = s1 + s2;
    cout << s3 << endl << s3.size();
    
    return 0;
}