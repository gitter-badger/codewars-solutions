import java.math.BigInteger;

class Easyline {
  static BigInteger easyLine(int n) {
    BigInteger c = BigInteger.ONE, sum = BigInteger.ONE;
    for (int i = 0; i <= n; i++) {
      c = c.multiply(BigInteger.valueOf(n - i)).divide(BigInteger.valueOf(i + 1));
      sum = sum.add(c.multiply(c));
    }
    return sum;
  }
}
