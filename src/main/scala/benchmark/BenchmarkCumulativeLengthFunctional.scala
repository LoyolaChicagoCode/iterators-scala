package benchmark

import functional.modular.CumLen
import org.openjdk.jmh.annotations.Benchmark

class BenchmarkCumulativeLengthFunctional extends Inputs {

  @Benchmark
  def run1_000() = CumLen.run(input1_000).foreach { _ => }

  @Benchmark
  def run10_000() = CumLen.run(input10_000).foreach { _ => }

  @Benchmark
  def run100_000() = CumLen.run(input100_000).foreach { _ => }

  @Benchmark
  def run1_000_000() = CumLen.run(input1_000_000).foreach { _ => }
}
