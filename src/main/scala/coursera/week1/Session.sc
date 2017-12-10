def abs(x: Double) = if (x > 0) x else -x

def sqrt(value: Double) = {
  def sqrtIter(guess: Double): Double = {
    if (isGoodEnough(guess))
      guess
    else
      sqrtIter(improveGuess(guess))
  }

  def isGoodEnough(guess: Double) = {
    abs(guess * guess - value) / value < 0.001
  }

  def improveGuess(guess: Double): Double = {
    (guess + value / guess) / 2
  }

  sqrtIter(1.0)
}

sqrt(1e-6)
