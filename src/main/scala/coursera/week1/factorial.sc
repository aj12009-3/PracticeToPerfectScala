object exercise{
  def factorial(n: Int) : Int = {
    def loop(n: Int, ans: Int = 1) : Int = {
      if (n == 0)
        ans
      else
        loop(n - 1, ans * n)
    }
    loop(n) 
  }
}

exercise.factorial(0)