#include <bits/stdc++.h>

typedef long long ll;
using namespace std;

int main(){
    ios::sync_with_stdio(0);
    cin.tie(0),cout.tie(0);
    ll n,k;
    cin >> n >> k;
    map<ll,ll>mp;
    for(int i=0; i<n; i++){
        ll x; cin >> x;
        mp[x]++;
    }
    for(auto it = mp.begin(); it != mp.end(); it++){
        if(it->second >= k) cout << it->first << " ";
    }
}
