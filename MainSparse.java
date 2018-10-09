import java.util.*;
class MainSparse
{
    public static void main()
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int n=SC.nextInt();
        System.out.println("Enter the no. of columns");
        int m=SC.nextInt();
        
        int a[][]=new int[n][m];
                SparseArray sparse = new SparseArray(n,m);
        System.out.println("Enter the elements");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                a[i][j]=SC.nextInt();
                sparse.enterlist(i,j,a[i][j]);
            }
        }
        System.out.println("What position's value do you want? Enter row and column");
        int r=SC.nextInt();
        int c=SC.nextInt();
        int val= sparse.getValueAt(r,c);
        
        System.out.println("Value at "+r+" and "+c+" = "+val);
    }
}
        

        
        
   