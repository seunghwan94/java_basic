package lesson11_exception;

import lesson11_exception.RangeException;

public class CustomExceptionMain {
	public static void main(String[] args) {
		int num = 192;
		if (num < 0 || num > 100) {
			throw new RangeException(0, 100);
		}
	}
}
