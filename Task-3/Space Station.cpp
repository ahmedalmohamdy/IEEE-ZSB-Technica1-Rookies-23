#include <iostream>
#include <algorithm>
using namespace std;
int main()
{
    int x,y ,mx = 0;
    cin>>x>>y;
    int street[y];
    for(int i=0 ; i<y ; i++)
        cin>>street[i];
    sort(street, street+y);
    for(int i=0 ; i<=street[0] ; i++)
        mx = max(mx, street[0]-i);
    for(int i=0 ; i<y-1 ; i++){
        for(int j = street[i] ; j<=street[i+1] ; j++) {
            mx = max(mx, min(j-street[i], street[i+1]-j));
        }
    }
    for(int i=street[y-1] ; i<x ; i++)
        mx = max(mx, i-street[y-1]);
    cout << mx << endl;
    return 0;
}