package academy.learnprogramming.challenge1

fun main(args: Array<String>) {

  // Declare two immutable String variables called hello1 and hello2. Assign "Hello" to both variables.
  val hello1: String = "Hello"
  val hello2 = "Hello"

  // Using one line of code, test whether hello1 and hello2 are referentially equal and print the result
  println("hello1 is referentially equal to hello2: ${hello1 === hello2}")

  // Do the same as above, but test for structural equality
  println("hello1 is structurally equal to hello2: ${hello1 == hello2}")

  // Declare a mutable variable of type Int and assign it the value of 2998
  var num = 2998

  val text: Any = "The Any type is the root of the Kotlin class hierarchy"
  if (text is String) {
    println("The uppercased string: ${text.uppercase()}")
  }

  // Using one line of code, print the following. Make sure your code is nicely indented
  //    1
  //   11
  //  111
  // 1111
  println("""   1
            |  11
            | 111
            |1111""".trimMargin())

  // Last challenge
  println("""1   1
             1  11
             1 111
             11111""".trimMargin("1"))
}