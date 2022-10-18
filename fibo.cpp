#include <iostream>
using namespace std;

void fibo(int lim, int t1 = 0, int t2 = 1)
{
  cout << "fibonaaci series: " << t1 << " " << t2;

  int nextTerm;

  for (int i = 3; i <= lim; i++)
  {
    nextTerm = t1 + t2;
    cout << " " << nextTerm;
    t1 = t2;
    t2 = nextTerm;
  }
}

int main()
{

  fibo(10);
  return 0;
}