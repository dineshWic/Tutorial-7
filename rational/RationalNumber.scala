package rational

case class RationalNum(p: Int, q: Int){
  if(q == 0) throw new IllegalArgumentException("Denominator cannot be 0")

  def this(p: Int) = this(p, 1)

  //get the values in simples form p=2,q=4
  private def GCD(a: Int, b: Int): Int = if (b == 0) a.abs else GCD(b, (a % b))

  private def gcd = GCD(q, p) //gcd =2
  private def numer = p / gcd // 2/2 =1
  private def denom = q / gcd // 4/2 = 2

  //negative
  def -(that: RationalNum) = RationalNum(numer * that.denom - that.numer * denom, denom * that.denom)
  override def toString = s"$numer/$denom"
}
