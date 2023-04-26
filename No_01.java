package midTerm;

public class No_01 {

	public static void main(String[] args) {

    // 1번 데이터 준비 및 출력용
		int index;
		int[] inputArray;
		inputArray = new int[10000];
		for(int i=0;i<inputArray.length;i++) {
			inputArray[i] = (int)(Math.random() * 10000000);
		}
		for( int i:inputArray ) {
			System.out.print( i + " ");
		}
	
		index = getMax( inputArray );
		
		System.out.println( "\n inputArray[" + index + "] = " + inputArray[index]);
		
		// 2번 풀이
		int[][] rndArray = new int[3][5];
		int max = 5;
		while( max > 0 ) {
			int i = (int)(Math.random()*rndArray.length);
			int j = (int)(Math.random()*rndArray[0].length);
			if( rndArray[i][j] == 0 ) {
				rndArray[i][j] = 1;
				max--;
			}
		}
		// -----------------------------------------------------------------------------
		
		// 2번 출력용
		for( int i=0; i<rndArray.length; i++) {
			for( int j=0; j<rndArray[i].length; j++ ) {
				System.out.print( rndArray[i][j] + " ");
			}
			System.out.println();
		}
		
		// 4번 풀이		
		Rectangle[] rectArray =	new Rectangle[3];
		rectArray[0] = new Rectangle(3,4);
		rectArray[1] = new Rectangle(4,5);
		rectArray[2] = new Rectangle(5,6);
		for( Rectangle rect:rectArray) {
			System.out.println( rect.getArea() );
		}
		// -------------------------------------------------------------------------------
		
	}

	// 1번 풀이 
	private static int getMax(int[] inputArray) {
		int max=0;
		int index=0;
		for(int i=0;i<inputArray.length;i++) {
			if( max < inputArray[i] ) {
				max = inputArray[i];
				index = i;
			}
		}		
		return index;
	}
	// ---------------------------------------------------------------
}

// 3번 풀이
class Rectangle {
	private int width;
	private int length;
	
	public Rectangle() {}
	public Rectangle(int width, int length ) {
		this.width = width;
		this.length = length;
	}
	
	public int getArea() {
		return width * length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
}
// ---------------------------------------------------------------------
