package methodsInJava;

public class Calculator04 {
	byte a = 60;
	byte b = 60;

	// Not necessarily important: extra information
	// return type method
	// in terms of byte without casting, not possible to execute code, need some
	// research.
	// need answer immediately
	public byte divition() {
		byte total = (byte) (a / b);
		System.out.println("Total Divition :" + total);
		return total;
	}

	// how the result is 16, while it should be 3600, out of range of byte
	// 60 * 60 = 3600 which is 111000010000 in binary form.
	// byte is a 8-bits data form. Therefore it will truncate into 8 bits of the
	// data which is equivalent to
	// 00010000 which is 16 in decimal. Hope this answer your question.
	// https://stackoverflow.com/questions/24236140/multiplying-two-byte-numbers
	public byte multiplication() {
		byte total = (byte) (a * b);
		System.out.println("Total Multiplication: " + total);
		return total;
	}

}
