class MyInteger {

	private int value;
	private static int v;

	MyInteger() {
		this.value = 10; // constructor set to 10 to test
	}

	MyInteger(int v) { // constructor to pass int value
		this.value = v;
	}

	MyInteger(MyInteger g) { // class constructor
		this.value = g.value;
	}

	public int getValue() {
		return this.value;
	}
//----------------------------------------------------
// test  isEven(),isOdd(),isPrime()
	
	public boolean isEven() {
		if (value % 2 == 0) {
			return true;
		} else
			return false;
	}

	public boolean isOdd() {
		if (value % 2 != 0) {
			return true;
		} else
			return false;
	}

	public boolean isPrime() {
		if (value > 2 && (value & 1) == 0) {
			return false;
		}
		for (int i = 3; i * i <= value; i += 2) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}
// -------------------------------------------------
// test  isEven(int),isOdd(int),isPrime(int)
	public static boolean isEven(int v) {
		if (v % 2 == 0) {
			return true;
		} else
			return false;
	}

	public static boolean isOdd(int v) {
		if (v % 2 != 0) {
			return true;
		} else
			return false;
	}

	public static boolean isPrime(int v) {
		if (v > 2 && (v & 1) == 0) {
			return false;
		}
		for (int i = 3; i * i <= v; i += 2) {
			if (v % i == 0) {
				return false;
			}
		}
		return true;
	}

// --------------------------------------------
// test  isEven(MyInteger),isOdd(MyInteger),isPrime(MyInteger)	
	public static boolean isEven(MyInteger b) {
		if (b.value % 2 == 0) {
			return true;
		} else
			return false;
	}

	public static boolean isOdd(MyInteger b) {
		if (b.getValue() % 2 != 0) {
			return true;
		} else
			return false;
	}

	public static boolean isPrime(MyInteger b) {
		if (b.value > 2 && (b.value & 1) == 0) {
			return false;
		}
		for (int i = 3; i * i <= v; i += 2) {
			if (b.value % i == 0) {
				return false;
			}
		}
		return true;
	}

// --------------------------------------------------
// test equals(int)
	public boolean equals(int a) {
		if (this.value == a) {
			return true;
		} else {
			return false;
		}
	}
// test equals(MyInteger)	
	public boolean equals (MyInteger a) {
		if(a.value == this.value) {
		return true;	
		}
		else {
			return false;
		}
	}
// ---------------------------------------------------
// test parseInt(char[])	
	public static int parseInt(char[] values) {
		String temp = new String(values);

		return parseInt(temp);
	}
// test parseInt(string)
	public static int parseInt(String value) {
		return Integer.parseInt(value);
	}

}// end class ----------------------------------------
