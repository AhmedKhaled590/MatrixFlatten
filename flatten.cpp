#include <iostream>
#include <vector>
using namespace std;

vector<int> flatten(vector<vector<vector<int>>> matrix3d)
{
    int n = matrix3d.size();
    int m = matrix3d[0].size();
    int p = matrix3d[0][0].size();
    vector<int> flattend(n * m * p);

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            for (int k = 0; k < p; k++)
            {
                int y = i * m * p + j * p + k;
                flattend[y] = matrix3d[i][j][k];
            }
        }
    }
    return flattend;
}

void print3dMatrix(vector<vector<vector<int>>> matrix3d)
{
    int n = matrix3d.size();
    int m = matrix3d[0].size();
    int p = matrix3d[0][0].size();
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            for (int k = 0; k < p; k++)
            {
                cout << matrix3d[i][j][k] << " ";
            }
            cout << endl;
        }
        cout << endl;
    }
}

void print1dMatrix(vector<int> matrix1d)
{
    int q = matrix1d.size();
    for (int i = 0; i < q; i++)
    {
        cout << matrix1d[i] << " ";
    }
    cout << endl;
}

int main()
{

    vector<vector<vector<int>>> matrix3d = {
        {{1, 2, 3},
         {4, 5, 6},
         {7, 8, 9}},
        {{10, 11, 12},
         {13, 14, 15},
         {16, 17, 18}},
        {{19, 20, 21},
         {22, 23, 24},
         {25, 26, 27}}};

    print3dMatrix(matrix3d);
    vector<int> flattend = flatten(matrix3d);
    print1dMatrix(flattend);
    return 0;
}