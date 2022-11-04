#include <iostream>
using namespace std;
int isPrime(int num){
if(num<=1)
{
    return 0;
}
for(int i=2;i<num;i++)
{
    if(num%i==0)
    return 0;
}

}
int main()
{
    int num;
    cout << "Enter a number: ";
    cin >> num;

    if(isPrime(num))
    {
        cout<<"PRIME";
    }
    else
    {
        cout<<"COMPOSITE";
    }
    return 0;
}