def sum(f: Int => Int)(a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a>b) acc
    else loop(a+1, f(a) + acc)
  }
  loop(a, 0)
}

sum((x:Int) => x)(1,2)

sum((x:Int) => x * x)(3,5)