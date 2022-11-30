#include <iostream>
using namespace std;

int main(){
    long long n;
    cin >> x;
    long long arr[x][x];
    long long sum1 = 0;
    long long sum2 = 0;
    for (int i = 0 ; i < x ; i++)
            for (int j = 0 ; j < x ; j++){
                cin >> arr[i][j];
                if (i == j) sum1 += arr[i][j];
                if ( i == (x - 1) - j) sum2 +=arr[i][j];
            }

    long long total = sum1 - sum2;
    if (total < 0) cout << -total << endl;
    else cout << total << endl;
}