package functional.modular

object CumLen {
  type Result = (String, Int)

  def accumulateCount(acc: Result, nextItem: String): Result =
    (nextItem, acc._2 + nextItem.length)

  def run(lines: Iterator[String], args: Array[String] = Array.empty): Iterator[Result] = {
    if args.length > 0 then {
      System.err.nn.println("args: " + args.toSeq)
    }
    lines.scanLeft("dummy", 0)(accumulateCount).drop(1)
  }
}

/** Reads lines and prints cumulative length of all lines so far along with most recent line itself. */
object CumulativeLengthFunctionalModular extends Main[CumLen.Result](CumLen.run)
