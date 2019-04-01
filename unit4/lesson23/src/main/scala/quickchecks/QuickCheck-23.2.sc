// Write a function, called superFlatten, that takes an instance of Option[Option[Option[String]]],
// and it returns a value of type Option[String] using the function flatten.

def superFlatten(opt: Option[Option[Option[String]]]): Option[String] =
  opt.flatten.flatten
