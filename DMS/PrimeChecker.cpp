#include <iostream>
using namespace std;

int isPrime(int num)
{
    if (num <= 0)
        return 0;

    for (int i = 2; i < num / 2; i++)
    {
        if (num % i == 0)
            return 0;
    }
}

int main()
{
    int num;
    cout << "Enter a number: ";
    cin >> num;

    if (isPrime(num))
        cout << num << " is a Prime number." << endl;

    else
        cout << num << " is not a Prime number." << endl;

    return 0;
}