import java.util.Scanner;
class MatrixAddition
{
 public static void main(String args[])
 {
  Scanner input=new Scanner(System.in);
  System.out.println("please enter number of rows:");
  int row = input.nextInt();
  System.out.println("please enter number of columns:");
  int col = input.nextInt();
  int[][] x = new int[row][col];
  int[][] y = new int[row][col];
  System.out.println("please enter first Matrix:");
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
   {
    x[i][j] = input.nextInt();
   }
  }
  System.out.println("please enter second Matrix:");
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
   {
    y[i][j] = input.nextInt();
   }
  }
  int[][] resultMatrix = new int[row][col];
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
   {
    resultMatrix[i][j] = x[i][j]+y[i][j];
   }
  }
  System.out.println("Result Matrix:");
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
   {
    System.out.print(resultMatrix[i][j]+"");
   }
   System.out.println();
  }
 }
}