#include <iostream>
#include <algorithm>
using namespace std;

int main(){

    long long nob;
    cin >> nob;
    long long vol[nob] , cap[nob];
    long long sumCap = 0;

     for (int i = 0; i < nob; i++)
    {
        cin>>vol[i]>>cap[i];
        sumCap +=vol[i];
    }

    sort(cap,cap+nob);
    long long largeBotCap =cap[0]+cap[1];

    if(largeBotCap >= sumCap)
        cout<<"Yes";
    else
        cout<<"No";

    return 0;
}