class Q1_and_Q2 {
  class rational(a:Int , b:Int ){
    def numer = a;
    def denom = b;

    def neg(r:rational) = new rational((-1)*r.numer , r.denom);

    def substraction(r1:rational) = new rational(numer*r1.denom - r1.numer.denom , r1.denom*denom);
  }

  val x = 3/4,val y=5/8,val z=2/7;
  println(x.substraction(y).substraction(z))

}
