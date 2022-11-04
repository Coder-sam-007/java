#include<iostream>
using namespace std;
#include<math.h>
int main()
{
    int n1,n2,k=0,l=0;
    cout<<"ENter two number";
    cin>>n1;
    cin>>n2;
    int f1[100];
    int f2[100];
    
    for(int i=1;i<n1;i++)
    {
        if(n1%i==0)
        {
            f1[k]=i;
            k++;
        }
    }
    for(int i=1;i<n2;i++)
    {
        if(n2%i==0)
        {
            f2[l]=i;
            l++;
        }
    }
    int r;
    if(k>l)
    {
        r=k;
    }
    else
    {
        r=l;
    }
    for(int j=0;j<r;j++)
    {
        if(f1[j]==f2[j])
        {

        }
    }
    cout<<"The factors of"<<n<<"are:-"<<endl;
    for(int j=0;j<k;j++)
    {
        cout<<j;
    }
    int HCF=f[0];
    for(int i=0;i<k;i++)
    {
         if(f[i]>HCF)
         {
            HCF=f[i];
         }
    }
    cout<<"HCF="<<HCF<<endl;
    return 0;
}