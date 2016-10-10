
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

void shr(int no)
{
    int i,j;
    if(no%3 == 0)
    {
        for(i=0;i<no;i++)
            cout<<"5";

    }
    else if(no%3==1)
    {
        if(no < 10)
            cout<<"-1";
        else if(no==10)
        {
            for(i=0;i<10;i++)
                cout<<"3";
        }

        else{
            int m,t;
            m=no/3;

            t=no-3;
            for(j=0;j<no-10;j++)
                cout<<"5";
            for(j=0;j<10;j++)
                cout<<"3";



        }
    }

    else{
        //int m,t;
       // m=no/3;
       if(no==2)
        cout<<"-1";
       else

       {
           for(j=0;j<no-5;j++)
            cout<<"5";
        for(j=0;j<5;j++)
            cout<<"3";
        }
    }
    }



int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int t,no;
    cin>>t;
    while(t--)
    {
        cin>>no;
        shr(no);
        cout<<endl;


    }
    return 0;
}
