/*UML
 * Rational
 * - numerator:BigInteger
 * - denominator: BigInteger
 * + Rational()
 * + Rational(numerator: BigInteger , denominator:BigInteger)
 * + getNumerator:BigInteger
 * + getDenominator:BigInteger
 * + add(secondRational:Rational):Rational
 * + subtract(secondRational: Rational): Rational
 * + multiply(secondRational:Rational):Rational
 * + divide(secondRational:Rational):Rational
 * + toString():String
 * - gcd(numerator: BigInteger ,denominator2: BigInteger):BigInteger
 */

import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {

	private BigInteger numerator;
	private BigInteger denominator;

	public Rational() {
		this.denominator = new BigInteger("1");
		this.numerator = new BigInteger("0");
	}
	// constructor to create a Rational object
	public Rational(BigInteger numerator, BigInteger denominator) {
		BigInteger gcd = gcd(numerator, denominator);
		if (denominator.intValue() > 0) {
			this.numerator = new BigInteger("1").multiply(numerator).divide(gcd);
		} else {
			this.numerator = new BigInteger("0").multiply(numerator).divide(gcd);
		}
		this.denominator = denominator.abs().divide(gcd);
	}
// gdc method for finding the greatest common denominator
	private static BigInteger gcd(BigInteger numerator2, BigInteger denominator2) {
		BigInteger n1 = numerator2.abs();
		BigInteger n2 = denominator2.abs();
		BigInteger gcd = new BigInteger("1");
		for (int k = 1; k <= n1.intValue() && k <= n2.intValue(); k++) {

			if (n1.intValue() % k == 0 && n2.intValue() % k == 0) {
				gcd = BigInteger.valueOf(k);

			}
		}
		return gcd;
	}
	// getters for numerator and denominator
	public BigInteger getNumerator() {
		return numerator;
	}

	public BigInteger getDenominator() {
		return denominator;
	}

	// add rational number to this rational
	public Rational add(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator())
				.add(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}

	// subtract rational number from this rational
	public Rational subtract(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator())
				.subtract(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}

	// multiply a rational number by this rational
	public Rational multiply(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getNumerator());
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}

	// divide a rational number by this rational
	public Rational divide(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator());
		BigInteger d = denominator.multiply(secondRational.getNumerator());
		return new Rational(n, d);
	}

	@Override // Overrides the toString method in the object class
	public String toString() {
		if (denominator.intValue() == 1) {
			return numerator + "";
		} else {
			return numerator + "/" + denominator;
		}
	}

	@Override // Implements the compareTo method in the Comparable class
	public int compareTo(Rational arg0) {
		if (this.subtract(arg0).getNumerator().intValue() < 0) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override // Overrides the equals method in the Object class
	public boolean equals(Object arg0) {
		if ((this.subtract((Rational) (arg0))).getNumerator().intValue() == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override // Implement the doubleValue method in Number class
	public double doubleValue() {

		return numerator.longValue() * 1.0 / denominator.longValue();
	}

	@Override // Implements the floatValut method in Number class
	public float floatValue() {

		return (float) doubleValue();
	}

	@Override // implements the intValue method in the Number class
	public int intValue() {

		return (int) doubleValue();
	}

	@Override // implements the longValue method in the Number class
	public long longValue() {

		return (long) doubleValue();
	}

}// end Rational
	// ---------------------------------------------------------------------------



