package it.unibo.pslab.oop.p03structured;

class Try {
	public static void main(String[] s) {
		IO.println(10 + 20); // 30
		IO.println(010 + 020); // 24
		IO.println(0xFFFFFFFF); // -1
		IO.println(0x7FFFFFFF); // 2147483647
		IO.println(0x80000000); // -2147483648
		IO.println(0x80000000 - 1); // 2147483647
		IO.println(2147483647 + 1); // -2147483648
		IO.println(2147483647L + 1); // 2147483648
		IO.println((0x0F0F | 0xF0F0) == 0xFFFF); // true
		IO.println((0x0F0F & 0xF0F0) == 0); // true
		IO.println((0x0F0F << 4) == 0xF0F0); // true
		IO.println((0x0F0F >> 4) == 0x00F0); // true
		IO.println(~0x0F0F == 0xFFFFF0F0); // true
		IO.println(10 / 3); // 3
		IO.println(10 % 3); // 1
		IO.println(3.5 / 51 * 51); // 3.5000000000000004
		IO.println(3.5f / 51 * 51);// 3.5000002
	}
}
