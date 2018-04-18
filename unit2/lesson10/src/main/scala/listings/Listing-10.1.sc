class Test {
  val configA = "I am public"
  private val configB = "I am private"
}

val test = new Test
test.configA
test.configB
