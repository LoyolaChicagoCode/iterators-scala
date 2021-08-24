package imperative.modular

import org.openjdk.jmh.annotations.Benchmark

class BenchmarkCumulativeLengthImperative {

  def sut = new AccumulateLength {
    var length = 0
    override def doOutput(result: (String, Int)): Unit =
      length += 1
  }

  @Benchmark
  def size1000 = sut.run(Iterator.fill(1000)("hello"))
}
