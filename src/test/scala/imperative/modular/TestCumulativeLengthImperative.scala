package imperative.modular

import org.scalatest.wordspec.AnyWordSpec

class TestCumulativeLengthImperative extends AnyWordSpec:

  /** Creates a (mutable!) SUT instance. */
  def createSUT() = new AccumulateLength with OutputToBuffer:
    override type Input = String

  "An imperative AccumulateLength" when:
    "given an empty iterator" should:
      "produce an empty output" in:
        // create SUT instance for this test case
        val sut = createSUT()
        // exercise SUT
        sut.run(Seq.empty)(Iterator.empty)
        // check effect on output observer
        assert(sut.buffer.isEmpty)

    "given a nonempty iterator" should:
      "produce the correct nonempty output" in:
        // input data for this test case
        val data = Seq("hello", "world", "what", "up")
        // create SUT instance for this test case
        val sut = createSUT()
        // exercise SUT
        sut.run(Seq.empty)(data.iterator)
        // check effect on output observer
        assert(sut.buffer == data.zip(Seq(5, 10, 14, 16)))

  "given a nonempty iterator" should:
    "exhibit the correct interactive behavior" in:
      // input data for this test case
      val input = Iterator("hello", "world", "what", "up")
      // create SUT instance for this test case
      val sut = new AccumulateLength with Tracing:
        override type Input = String
      // exercise SUT
      sut.run(Seq.empty)(input)
      // check correctness of resulting interactions
      import sut.TraceEvent.{InputEvent as i, OutputEvent as o}
      assert(sut.trace == Seq(
        i("hello"), o(("hello", 5)),
        i("world"), o(("world", 10)),
        i("what"), o(("what", 14)),
        i("up"), o(("up", 16))))

end TestCumulativeLengthImperative
