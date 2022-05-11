#include <iostream>
#include <vector>
using namespace std;

vector<int> flatten(vector<vector<vector<int>>> matrix3d);
void print3dMatrix(vector<vector<vector<int>>> matrix3d);
void print1dVector(vector<int> matrix1d);

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
    print1dVector(flattend);

    char input;
    int n = 0, m = 0, p = 0;

    do
    {
        cout << "Enter number of layers: \n";
        cin >> n;
        cout << "Enter number of rows: \n";
        cin >> m;
        cout << "Enter number of columns: \n";
        cin >> p;
        vector<vector<vector<int>>> inputMatrix3d(n, vector<vector<int>>(m, vector<int>(p)));
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                for (int k = 0; k < p; k++)
                {
                    cout << "Enter element number(" + to_string(i * m * p + j * p + k) + ")\n";
                    cin >> inputMatrix3d[i][j][k];
                }
            }
        }
        print3dMatrix(inputMatrix3d);
        flattend = flatten(inputMatrix3d);
        print1dVector(flattend);
        cout << "enter 'q' to quit or any other key to continue: ";
        cin >> input;
    } while (input != 'q');

    return 0;
}

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

void print1dVector(vector<int> matrix1d)
{
    int q = matrix1d.size();
    for (int i = 0; i < q; i++)
    {
        cout << matrix1d[i] << " ";
    }
    cout << endl;
}
