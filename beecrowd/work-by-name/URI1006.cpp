#include <stdio.h>

class AlunoOperations
{
    public:
        
        float m;

        float MediaCalc(float n[2])
        {
            m = ((n[0] * 2) + (n[1] * 3) + (n[2] * 5))/10;
            return m;
        }
};
 
int main() {

    float notas[3], media; 
    AlunoOperations alunos; 
    
    for(int i = 0; i < 3; i++)
    {
        scanf("%f", &notas[i]);
    }

    media = alunos.MediaCalc(notas);
    printf("MEDIA = %.1f\n", media);

    return 0;
}