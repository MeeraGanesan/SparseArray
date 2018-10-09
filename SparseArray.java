import java.util.*;
public class SparseArray
{
    private int numRows;
    private int numCols;
    private List<SparseArrayEntry> entries;
    public SparseArray()
    {
        entries=new ArrayList<SparseArrayEntry>();
        
    }
    
    public SparseArray(int r, int c)
    {
                entries=new ArrayList<SparseArrayEntry>();
                numRows = r;
                numCols = c;
    }
    
    public int getNumRows()
    {
        return numRows;
    }
    public int getNumCols()
    {
        return numCols;
    }
    
    public int getValueAt(int row,int col)
    { 
        
         if(!(row <= getNumRows() && col <= getNumCols()))
         {
             System.out.println("Row or col index is out of range");
             return -1;
            }
         
         for (SparseArrayEntry e: entries)
         { 
             if((e.getRow() == row) &&(e.getCol() == col))
             {
               
                  return e.getValue();
                }
         }
            
           
               return 0;
   }   
            
            
    public void enterlist(int r, int c, int v)
    {
        entries.add(new SparseArrayEntry(r,c,v));
    }  


} 