#include<bits/stdc++.h>
using namespace std;
class PS
{
    int TS, MS;

public:
    PS operator+(PS y);
    PS operator-(PS y);
    PS operator*(PS y);
    PS operator/(PS y);
    double operator-(); // tinh gia tri PS
    friend istream &operator>>(istream &x, PS &y);
    friend ostream &operator<<(ostream &x, PS y);
};
PS PS::operator+(PS y)
{
    PS tg;
    tg.TS = TS * y.MS + MS * y.TS;
    tg.MS = MS * y.MS;
    return tg;
}
PS PS::operator-(PS y)
{
    PS tg;
    tg.TS = TS * y.MS - MS * y.TS;
    tg.MS = MS * y.MS;
    return tg;
}
PS PS::operator*(PS y)
{
    PS tg;
    tg.TS = TS * y.TS;
    tg.MS = MS * y.MS;
    return tg;
}
PS PS::operator/(PS y)
{
    PS tg;
    tg.TS = TS * y.MS;
    tg.MS = MS * y.TS;
    return tg;
}
double PS::operator-()
{
    return (double)TS / MS;
}
istream &operator>>(istream &x, PS &y)
{
    cout << "Nhap tu so: ";
    x >> y.TS;
    cout << "Nhap mau so: ";
    x >> y.MS;
    return x;
}
ostream &operator<<(ostream &x, PS y)
{
    x << y.TS << "/" << y.MS;
    return x;
}
int main()
{
    PS a, b;
    cout << "Nhap phan so thu nhat: " << endl;
    cin >> a;
    cout << "Nhap phan so thu 2: " << endl;
    cin >> b;
    PS T = a + b;
    PS H = a - b;
    PS TICH = a * b;
    PS THUONG = a / b;

    // Chú ý: #include “fstream”
    ofstream f("TENFILE.txt", ios::app);
    f << a << " + " << b << " = " << T << " = " << -T << endl;
    f << a << " - " << b << " = " << H << " = " << -H << endl;
    f << a << " * " << b << " = " << TICH << " = " << -TICH << endl;
    f << a << " : " << b << " = " << THUONG << " = " << -THUONG << endl; // Neu muon xuất màn hình, thay f bằng cout
    ifstream f1("TENFILE.txt", ios::in);
    char S[200];
    while (!f1.eof())
    {
        f1.getline(S, 200);
        cout << S << endl;
    }
    return 0;
}