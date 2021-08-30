package imperative.simple

/** Reads lines and prints line count along with line itself. */
object LineCountImperative {
  def main(args: Array[String]): Unit = {
    import sun.misc.Signal
    if !System.getProperty("os.name").nn.contains("Windows") then
      Signal.handle(new Signal("PIPE"), (_: Signal | Null) => scala.sys.exit())

    var count = 0

    for line <- scala.io.Source.stdin.getLines() do {
      count += 1
      println((count, line))
    }
  }
}
