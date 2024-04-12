package assignment;

public class MatrixQue4 {
	 int rows;
	 int column;
	 int matrix[][];
	
	public MatrixQue4(int rows, int column) {
		
		this.rows = rows;
		this.column = column;
		matrix=new int[rows][column];
	
	}
	public int getRows()
	{
		return rows;
	}
	public int getColumns()
	{
		return column;
	}
	private void insertElement(int i,int j,int value)
	{
		if(i>=0 && i<rows && j>=0 && j<column) 
		{
			matrix[i][j]=value;
		}
		else {
			System.out.println("Invalid index Position");
		}
	}
	public static MatrixQue4 addMatrix(MatrixQue4 obj1,MatrixQue4 obj2)
	{
		if(obj1.rows!=obj2.rows || obj1.column!=obj2.column)
		{
			System.out.println("Addition not possible");
			return null;
		}
		else
		{
			MatrixQue4 result=new MatrixQue4(obj1.rows,obj2.column);
		
			for(int i=0;i<obj1.rows;i++)
			{
				for(int j=0;j<obj1.column;j++)
				{
					result.matrix[i][j]=obj1.matrix[i][j]+obj2.matrix[i][j];
			}
		}
			return result;
	}
}
	public void display() {
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
			
		}
	}
	public static void main(String[] args) {
	MatrixQue4 one=new MatrixQue4(2,2);
	MatrixQue4 two=new MatrixQue4(2,2);
	one.insertElement(0, 0, 1);
	one.insertElement(0, 1, 1);
	one.insertElement(1, 0, 1);
	one.insertElement(1, 1, 1);
	two.insertElement(0, 0, 2);
	two.insertElement(0, 1, 2);
	two.insertElement(1, 0, 2);
	two.insertElement(1, 1, 2);
	MatrixQue4 result=addMatrix(one,two);
	result.display();
  }
}


