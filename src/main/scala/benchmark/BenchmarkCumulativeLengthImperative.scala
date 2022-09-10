package benchmark

import imperative.modular.AccumulateLength
import org.openjdk.jmh.annotations.Benchmark

class BenchmarkCumulativeLengthImperative extends Inputs:

  def sut = new AccumulateLength:
    var length = 0
    override def doOutput(result: (String, Int)) = length += 1

  @Benchmark
  def run1_000() = sut.run(input1_000)

  @Benchmark
  def run10_000() = sut.run(input10_000)

  @Benchmark
  def run100_000() = sut.run(input100_000)

  @Benchmark
  def run1_000_000() = sut.run(input1_000_000)

end BenchmarkCumulativeLengthImperative
