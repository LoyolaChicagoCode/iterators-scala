package imperative.simple

object TemperatureConversion {
  def main(args: Array[String]): Unit = {
    var line: String | Null = scala.io.StdIn.readLine()
    while line != null do {
      val raw = line.nn.toInt
      val celsius = math.round(raw.toFloat / 20)
      println(celsius)
      line = scala.io.StdIn.readLine()
    }
  }
}