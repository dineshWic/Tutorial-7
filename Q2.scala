import rational.RationalNumber

object Q2 extends App{
  val x = RationalNumber(3, 4)
  val y = RationalNumber(5, 8)
  val z = RationalNumber(2, 7)

  println(x - y - z)
}
