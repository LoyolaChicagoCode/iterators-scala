package functional.modular

/** Reads lines and prints line count along with line itself. */
object LineCountFunctionalModular extends App {

  runWithStdIO(run, args)

  def run(lines: Iterator[String], args: Array[String] = Array.empty): Iterator[(Int, String)] = {
    if (args.length > 0) {
      System.err.println("args: " + args.toSeq)
    }
    val counts = Iterator.from(1)
    counts.zip(lines)
  }
}
