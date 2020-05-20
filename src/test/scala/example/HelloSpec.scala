package example

class GreetingerSpec extends munit.FunSuite {

  test("greetings for 1 person") {
    val sut = new Greetinger(Seq("Finn"))

    assertEquals(sut.greetings, "Hello!")
  }

  test("greetings for multiple people") {
    val sut = new Greetinger(Seq("Finn", "BMO"))

    assertEquals(sut.greetings, "What a crowd!")
  }

  test("greetings for no one") {
    val sut = new Greetinger(Seq())

    assertEquals(sut.greetings, "No one to greet :(")
  }

  test("should not greet Ice King") {
    val sut = new Greetinger(Seq("Ice King"))

    assertEquals(sut.greetings, "No one to greet :(")

  }
}
