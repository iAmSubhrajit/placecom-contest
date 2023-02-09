#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define ll long long
int main() {
	// Your code here
    int n, m;
    cin>> n>> m;
    vector<vector <int>> mat(n, vector<int>(m));
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++)
        cin>>mat[i][j];
    }
    ll mx=0;
    int mx_idx=0;
    for(int i=0;i<n;i++){
        ll sum= accumulate(mat[i].begin(), mat[i].end(),0LL);
        if(sum>mx){
            mx=sum;
            mx_idx=i;
        }
    }
    cout<<mx_idx+1;
}
