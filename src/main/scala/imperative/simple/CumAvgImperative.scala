package imperative.simple

object CumAvgImperative {
  def main(args: Array[String]): Unit = {
    var count = 0
    var sum = 0.0
    var line: String | Null = scala.io.StdIn.readLine()
    while line != null do {
      count += 1
      sum += line.nn.toDouble
      val avg = sum / count
      println(s"$count: $avg")
      line = scala.io.StdIn.readLine()
    }
  }
}
