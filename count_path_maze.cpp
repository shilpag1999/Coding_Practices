// C++ program to count number of paths in a maze
// with [[0 0 0] [0 x x] [0 0 0]].output=3
#include<bits/stdc++.h>
using namespace std;
#define R 3
#define C 3

// Returns count of possible paths in a maze[R][C]
// from (0,0) to (R-1,C-1)
int countPaths(int maze[][C])
{
	// If the initial cell is blocked, there is no
	// way of moving anywhere


	// Initializing the leftmost column
	for (int i=0; i<R; i++)
	{
		if (maze[i][0] == 0)
        {maze[i][0] = 1;
            }

		// If we encounter a blocked cell in leftmost
		// row, there is no way of visiting any cell
		// directly below it.
	}

	// Similarly initialize the topmost row
	for (int i=1; i<C; i++)
	{
		if (maze[0][i] == 0)
        {maze[0][i] = 1;
            }

		// If we encounter a blocked cell in bottommost
		// row, there is no way of visiting any cell
		// directly below it.
	}

	// The only difference is that if a cell is -1,
	// simply ignore it else recursively compute
	// count value maze[i][j]
	for (int i=1; i<R; i++)
	{
		for (int j=1; j<C; j++)
		{
			// If blockage is found, ignore this cell
			if(maze[i][j] == 'X')
            {maze[i][j]=0;}

			// If we can reach maze[i][j] from maze[i-1][j]
			// then increment count.
			if (maze[i-1][j] >= 0 && maze[i-1][j] != 'X')
      {	maze[i][j] = (maze[i][j] + maze[i-1][j]);
          cout<<maze[i][j]<<" "<<i<<j<<endl;}
			// If we can reach maze[i][j] from maze[i][j-1]
			// then increment count.
			if (maze[i][j-1] >= 0 && maze[i][j-1] != 'X')
     
      {maze[i][j] = (maze[i][j] + maze[i][j-1]);
       cout<<maze[i][j]<<" "<<i<<j<<endl;}
		}
	}

	// If the final cell is blocked, output 0, otherwise
	// the answer
	return (maze[R-1][C-1] != 'X')? maze[R-1][C-1] : 0;
}

// Driver code
int main()
{
	int maze[R][C] = {{'X','X','X'},
                      {'X',0,0},{0,0,0}};
	cout << countPaths(maze);
	return 0;
}
