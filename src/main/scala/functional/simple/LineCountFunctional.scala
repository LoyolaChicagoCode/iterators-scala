package functional.simple

/** Reads lines and prints line count along with line itself. */
object LineCountFunctional:
  def main(args: Array[String]): Unit =
    val lines = scala.io.Source.stdin.getLines()

    val counts = Iterator.from(1)
    val results = counts.zip(lines)

    results takeWhile { r =>
      println(r)
      // terminate on I/O error such as SIGPIPE
      !scala.sys.process.stdout.checkError()
    }
end LineCountFunctional
