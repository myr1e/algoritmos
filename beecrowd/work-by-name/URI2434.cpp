#include <iostream>

using namespace std;

int main()
{
    int N, S, mov, menor_saldo; 
    scanf("%d%d", &N, &S);

    menor_saldo = S; 

    for(int i = 0; i < N; i++)
    {
        scanf("%d", &mov);
        S = S + mov;

        if(S < menor_saldo)
        {
            menor_saldo = S;
        }
    }
    cout << "" << menor_saldo << endl;
    return 0;
}