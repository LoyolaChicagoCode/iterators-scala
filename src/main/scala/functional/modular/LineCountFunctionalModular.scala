package functional.modular

object LineCount {
  type Result = (Int, String)

  def run(lines: Iterator[String], args: Array[String] = Array.empty): Iterator[Result] = {
    if args.length > 0 then {
      System.err.nn.println("args: " + args.toSeq)
    }
    val counts = Iterator.from(1)
    counts.zip(lines)
  }
}

/** Reads lines and prints line count along with line itself. */
object LineCountFunctionalModular extends Main[LineCount.Result](LineCount.run)
