package example

class Greetinger(peopleToGreet: Seq[String]) {
  def greetings: String = {
    val iceKing = "Ice King"
    peopleToGreet.filterNot(_ == iceKing).size match {
      case 1 => s"Hello!"
      case 0 => "No one to greet :("
      case _ => "What a crowd!"
    }
  }
}
