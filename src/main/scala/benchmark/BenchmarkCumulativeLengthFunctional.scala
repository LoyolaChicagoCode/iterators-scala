package functional.modular

import org.openjdk.jmh.annotations.Benchmark

class BenchmarkCumulativeLengthFunctional {

  def input1_000 = Iterator.fill(1000)("hello")

  def input10_000 = Iterator.fill(1000)("hello")

  def input100_000 = Iterator.fill(1000)("hello")

  def input1_000_000 = Iterator.fill(1000)("hello")

  @Benchmark
  def size1_000 = CumLen.run(input1_000)

  @Benchmark
  def size10_000 = CumLen.run(input10_000)

  @Benchmark
  def size100_000 = CumLen.run(input100_000)

  @Benchmark
  def size1_000_000 = CumLen.run(input1_000_000)
}
