val toPrettyString: PartialFunction[Any, String] = {
    case x: Int if x > 0 => s"positive number: $x"
    case s: String => s
  }


toPrettyString(1)
toPrettyString("hello")
toPrettyString(-1)
