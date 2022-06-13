#include<bits/stdc++.h>
using namespace std;
class DOANHNGHIEP
{
    char TENDN[20];
    char DCDN[20];
    int SNV;
    double DOANHTHU;

public:
    void NHAP();
    void XUAT();
};
void DOANHNGHIEP::NHAP()
{
    cout << "Ten DN: ";
    fflush(stdin);
    gets(TENDN);
    cout << "Dia chi DN: ";
    fflush(stdin);
    gets(DCDN);
    cout << "So nhan vien: ";
    cin >> SNV;
    cout << "Doanh thu: ";
    cin >> DOANHTHU;
}
void DOANHNGHIEP::XUAT()
{
    cout << "Ten DN: " << TENDN << endl;
    cout << "Dia chi: " << DCDN << endl;
    cout << "So NV: " << SNV << endl;
    cout << "Doanh thu: " << DOANHTHU << endl;
}
int main()
{
    DOANHNGHIEP *x;
    int n;
    cout <<"n =";
    cin >> n;
    x = new DOANHNGHIEP[n];
    for (int i = 0; i < n; i++)
        x[i].NHAP();
    cout << endl
         << "Doanh nghiep vua nhap:" << endl;
    for (int i = 0; i < n; i++)
        x[i].XUAT();
    return 0;
}