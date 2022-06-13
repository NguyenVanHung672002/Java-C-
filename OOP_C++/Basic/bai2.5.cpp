#include <bits/stdc++.h>
using namespace std;
class OTO
{
    char MAOTO[20];
    float GIAMUA;
    int NAMSD;
    double TYLEKHAUHAO;

public:
    void NHAP();
    void XUAT();
};
void OTO::NHAP()
{
    cout << "Ma OTO: ";
    fflush(stdin);
    gets(MAOTO);
    cout << "Gia mua moi:";
    cin >> GIAMUA;
    cout << "So nam sd: ";
    cin >> NAMSD;
    cout << "Ty Le Khau Hao: ";
    cin >> TYLEKHAUHAO;
}
void OTO::XUAT()
{
    cout << setw(15) << MAOTO << setw(10) << GIAMUA << setw(10) << NAMSD
         << setw(10) << TYLEKHAUHAO;
    double GT = GIAMUA;
    for (int i = 0; i < NAMSD; i++)
        GT = GT - GT * TYLEKHAUHAO;
    cout << setw(15) << fixed << GT << endl;
}
int main()
{
    int n;
    cout << "n= ";
    cin >> n;
    OTO *x = new OTO[n];
    for (int i = 0; i < n; i++)
        x[i].NHAP();
    cout << endl
         << "Cac OTO vua nhap:" << endl;
    for (int i = 0; i < n; i++)
        x[i].XUAT();
    return 0;
}