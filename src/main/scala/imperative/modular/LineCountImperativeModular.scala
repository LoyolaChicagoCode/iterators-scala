package imperative.modular

/**
 * Provides a main method for reading lines and printing line count along with line itself.
 * Depends on a suitable Output provider.
 */
trait CountLines extends Task[String] with Output[(Int, String)]:

  override def run(input: Iterator[String], args: Array[String] = Array.empty) =
    if args.length > 0 then
      System.err.nn.println("args: " + args.toSeq)
    var count = 0
    for line <- input do
      count += 1
      doOutput((count, line))
end CountLines

/** A concrete main application object. */
object LineCountImperativeModular extends Main[(Int, String)] with CountLines