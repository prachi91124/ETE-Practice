// Write a program to check whether two given strings are anagram or not

#include<bits/stdc++.h>
using namespace std;

bool fn(string s1, string s2){
    if(s1.size() != s2.size()){
        return false;
    }

    vector<char> ar1(s1.begin(),s1.end());
    vector<char> ar2(s2.begin(),s2.end());

    sort(ar1.begin(), ar1.end());
    sort(ar2.begin(), ar2.end());

    if(ar1 == ar2){
        return true;
    }
    return false;

}

bool fn2(string s1, string s2){
    if(s1.size() != s2.size()){
        return false;
    }

    int count[26] = {0};

    for(int i = 0; i < s1.size(); i++){
        count[s1[i] - 'a']++;
        count[s2[i] - 'a']--;
    }

    for(int i = 0; i < 26; i++){
        if(count[i] != 0){
            return false;
        }
    }
    return true;
}
int main() {
    string s1, s2;
    cin >> s1 >> s2;

    cout << (fn2(s1,s2)? "Yes, given strings are anagrams": "No, given strings are not anagrams");
    return 0;
}