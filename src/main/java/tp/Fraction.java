package tp;

/**
 * This class represents a fraction, always in its reduced form. 
 * @author Virginie Van den Schrieck
 *
 */

public class Fraction {
	
	//Constraint : The fraction must always be in reduced form
	private int numerator;
	private int denominator;
	
	
	/**
	 * Create a nul fraction
	 */
	public Fraction() {
		super();
		numerator = 0; 
		denominator = 1;
	}
	/**
	 * @param numerator 
	 * @param denominator must be different from zero 
	 * 
	 */
	public Fraction(int numerator, int denominator) {
		super();
	}
	
	/**
	 * This constructor builds a fraction based on a mixed number, i.e. the sum of a 
	 * integer and a fraction. Example : One and a half <=> 1 + 1/2
	 * @param wholePart the integer part of the fraction to be created
	 * @param properFrac the fractional part of the mixed number
	 */
	public Fraction (int wholePart , Fraction properFrac) {
		super();
	}
	/**
	 * @return the numerator
	 */
	public int getNumerator() {
		return numerator;
	}
	/**
	 * After any change, the fraction is reduced
	 * @param numerator the numerator to set
	 */
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	/**
	 * @return the denominator
	 */
	public int getDenominator() {
		return denominator;
	}
	/**
	 * If the denominator is different from zero, the fraction is changed. 
	 * After the operation, the fraction is reduced. 
	 * Nothing is done in case of nul denominator for now : this will have to be change 
	 * in the future
	 * @param denominator the denominator to set, must be non zero. 
	 */
	public void setDenominator(int denominator) {
		
	}
	/**
	 * Convert the fraction to its reduced form.  In case of a negative fraction, 
	 * the numerator must be positive and the denominator must be negative. 
	 */
	private void reduce() {
		
	}
	/**
	 * Get a textual representation of the fraction
	 * Ex : 3, 1/2, 4/3
	 */
	
	public String toString() {
		return "Fraction []";
	}
	
	/**
	 * Represents the fraction as a mixed number, i.e. the sum of a integer and 
	 * a proper fraction. 
	 * Ex : 1 + 1/2
	 * Ex : 2/3
	 * @return a textual representation of the fraction as a mixed number. 
	 */
	public String asMixedNumber() {
		return "";
	}
	
	/**
	 * Computes the sum of two fractions.  Operands are left unmodified. 
	 * @param f a non null fraction
	 * @return a new fraction which is the sum of f and the current fraction, in its reduced form. 
	 */
	public Fraction add(Fraction f) {
		return null;
	}
	/**
	 * Computes the difference of two fractions.  Operands are left unmodified. 
	 * @param f a non null fraction
	 * @return a new fraction which is the difference of f and the current fraction, in its reduced form. 
	 */	
	public Fraction soustract(Fraction f) {
		return null;
	}
	/**
	 * Computes the produc of two fractions.  Operands are left unmodified. 
	 * @param f a non null fraction
	 * @return a new fraction which is the product of f and the current fraction, in its reduced form. 
	 */
	public Fraction multiply(Fraction f) {
		return null;
	}
	/**
	 * Computes the division of two fractions.  Operands are left unmodified. 
	 * @param f a non null fraction
	 * @return a new fraction which is the division of f and the current fraction, in its reduced form. 
	 */
	public Fraction divide(Fraction f) {
		return null;
	}
	/**
	 * Computes the value of the current fraction raised to the given power. Current fraction is unmodified.
	 * @param power the power to which the fraction is raised
	 * @return a new fraction equals to the current fraction raised to the given power.  
	 */
	public Fraction raiseToPower(Fraction power) {
		return null;
	}
	
	/**
	 * @return true if the current fraction is equals to zero
	 */
	public boolean isZero() {
		return false;
	}
	
	/**
	 * @return true if the current fraction represents an integer value
	 */
	public boolean isInteger() {
		return false;
	}
	
	/**
	 * @return true if the current fraction is strictly less than 0
	 */
	public boolean isNegative() {
		return false;
	}
	
	/**
	 * Compares two fractions
	 * @param f a non null fraction
	 * @return true if f and the current fraction have the same value
	 */
	public boolean equals(Object f) {
		return false;
	}
	
	
	/**
	 * Compares two fractions
	 * @param f a non null fraction
	 * @return a positive number if the current fraction is strictly greater than f, 
	 * 		   a negative number if the current fraction is strictly less than f, 
	 * 		   0 otherwise. 
	 */
	public int compareTo(Fraction f) {
		return 0;
	}
	
	/**
	 * @return true if the current fraction is a unit fraction, i.e. its numerator is 1 in its reduced form
	 */
	public boolean isUnitFraction() {
		return false;
	}
	/**
	 * 
	 * @return true if the fraction is proper, i.e. its absolute value is strictly less than 1
	 */
	public boolean isProperFraction() {
		return true;
	}
	/**
	 * 
	 * @param f une fraction non null
	 * @return true if the absolute value of the difference between f and the current fraction is a unit fraction
	 */
	public boolean isAdjacentTo(Fraction f) {
		return true;
	}
	/**
	 * @return the decimal value of the fraction
	 */
	public double toDouble() {
		return 0.0;
	}
	
	/**
	 * @return a new fraction with the same value as the current one
	 */
	public Fraction clone() {
		return null;
	}
	
}
