package functional.modular

/** A transformation of an input stream to a result stream. */
type Task[-Input, +Result] = (Iterator[Input], Array[String]) => Iterator[Result]

/**
 * Provides a reusable method for invoking a task with stdin and stdout.
 * Depends on a suitable task (run method) that transforms an input stream to an output stream;
 * this dependency uses explicit constructor injection.
 */
trait Main[Result](run: Task[String, Result]) {
  def main(args: Array[String]): Unit = {
    val lines = scala.io.Source.stdin.getLines()
    val result = run(lines, args)
    result.foreach { r => println(r) }
  }
}