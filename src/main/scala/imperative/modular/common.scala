package imperative.modular

/** A dependency (plug-in contract) on an update method (Observer). */
trait Observer:
  type Result
  def update(result: Result): Unit
end Observer

/** An observer that prints its updates to stdout. */
trait StdoutObserver extends Observer:
  override def update(result: Result): Unit = println(result)
end StdoutObserver

/**
 * A simple component that provides a run method.
 * Typically reports results to an Observer provided upon creation.
 */
trait Task:
  def run(): Unit
end Task

/**
 * A dependency (plug-in contract) on a run method that processes an input stream.
 * Typically reports results to an Observer provided as a mixin.
 */
trait TaskFactory extends Observer:
  type Input
  type Result
  def create(args: Seq[String], input: Iterator[Input]): Task
end TaskFactory

/**
 * An Observer mixin for running a Task within a suitable main method.
 * The Task receives input from stdin, and its Observer updates go to stdout.
 */
trait Main extends StdoutObserver:
  self: TaskFactory =>
  override type Input = String
  def main(args: Array[String]): Unit =
    val lines = scala.io.Source.stdin.getLines()
    val task = create(args.toIndexedSeq, lines)
    task.run()
end Main
