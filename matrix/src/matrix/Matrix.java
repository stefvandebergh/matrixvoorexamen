package matrix;




/**
 * 
 * @immutable 
 * 
 * @invar | getNbColumns() >= 1
 * @invar | getNbRows() >= 1
 * @invar | getElementsRowMajor().length == getNbRows() * getNbColumns()
 * @invar | getElementsColumnMajor().length == getNbRows() * getNbColumns()
 * @invar | getElementsRowMajor() != null
 * @invar | getElementsColumnMajor() != null
 */
public class Matrix {

	/**
	 * @invar | elements != null
	 * @invar | elements.length == nbRows*nbColumns
	 */
	private double[] elements;
	/**
	 * @invar | nbRows >= 1
	 */
	private int nbRows;
	/**
	 * @invar | nbColumns >=1
	 */
	private int nbColumns;
	
	
	public Matrix(int nbRows, int nbColumns,  double[] arrayrowmajororder ) {
		this.elements = arrayrowmajororder.clone();
		this.nbRows = nbRows;
		this.nbColumns= nbColumns;
	}
	
	/** 
	 * @basic
	 */
	public int getNbColumns() {
		return this.nbColumns;
	}
	
	/**
	 * @basic
	 */
	public int getNbRows() {
		return this.nbRows;
	}
	
	public double getElement(int Row, int Column) {
		return elements[Row*this.nbColumns+ this.nbColumns ];
		
	}
	/**
	 * @inspects | this
	 * @basic
	 * @creates | result
	 */
	public double[] getElementsRowMajor() {
		return elements.clone();
	}
	
	/**
	 * @inspects | this
	 * @basic
	 * @creates | result
	 */
	public double[] getElementsColumnMajor() {
		double[] newelements = new double[elements.length];
		for(int i =0 ; i<this.nbRows ; i++) {
			for (int j = 0 ; j < this.nbColumns ; j ++) {
				newelements[j*nbRows+ i] = this.elements[i*nbColumns + j ];
			}
			
		}
		return newelements;
	}
	
	public double[][] getElementsArrayOfRows() {
	
	}
	
	public double[][] scaled(int factor){
		
	}
	
	public double[][] plus(int factor) {
		
	}
}
