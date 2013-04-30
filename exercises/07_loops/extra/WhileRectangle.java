public class WhileRectangle {

  public int height = 10;
  public int width = 20;

  public void displayRectangle() {

    int colCount = 0;
    int rowCount = 0;
    
    while (rowCount < height) {
      colCount=0;
      
      while (colCount < width) {
	      System.out.print("@");
	      colCount++;
      }
      width -= 2;
      System.out.println();
      rowCount++;
    }
  }
}
