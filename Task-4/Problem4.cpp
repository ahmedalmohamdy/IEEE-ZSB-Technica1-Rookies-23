#include <bits/stdc++.h>

typedef long long ll;
using namespace std;

int main(){
    ios::sync_with_stdio(0);
    cin.tie(0),cout.tie(0);
    ll n;
    cin >> n;
    ll a[n]{};
    for(int i=0; i<n; i++){
        cin >> a[i];
    }
    reverse(a, a+n);
    bool done = false;
    for(int i=0; i<n; i++){
        if(a[i] < 9){
            a[i]++; done = true;
            break;
        }
        else{
            a[i] = 0;
        }
    }
    if(!done) cout << 1 << " ";
    for(int i=n-1; i>=0; i--){
        cout << a[i] << " \n"[i == 0];
    }
}