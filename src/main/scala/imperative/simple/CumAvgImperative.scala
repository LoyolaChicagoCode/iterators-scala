package imperative.simple

object CumAvgImperative extends App {
  given CanEqual[Any, Null] = CanEqual.derived // enables line != null check
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
