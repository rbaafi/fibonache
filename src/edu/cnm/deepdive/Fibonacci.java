package edu.cnm.deepdive;

import java.math.BigInteger;

public class Fibonacci {

  public static BigInteger fibonacci(int n) {
    BigInteger prev = BigInteger.valueOf(-1);
    BigInteger curr = BigInteger.ONE;
    for (int i = 0; i <= n; i++) {
      BigInteger temp = prev.add(curr);
      prev = curr;
      curr = temp;
    }
    return curr;
  }

}
