package imperative.simple

/** Reads lines and prints cumulative length of all lines so far along with most recent line itself. */
object CumulativeLengthImperative {
  def main(args: Array[String]): Unit = {
    var line = "dummy"
    var length = 0
    val lines = scala.io.Source.stdin.getLines()
    while lines.hasNext do {
      val next = lines.next()
      line = next
      length = length + next.length
      println((line, length))
    }
  }
}
