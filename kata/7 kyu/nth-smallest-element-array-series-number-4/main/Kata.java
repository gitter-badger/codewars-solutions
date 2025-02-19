import static java.util.stream.IntStream.of;

class Kata {
  static int nthSmallest(int[] arr, int n) {
    return of(arr).sorted().limit(n).skip(n - 1L).findFirst().orElse(0);
  }
}
