
import account.Account

object Q3 extends App{
  val account_1 = Account("001", 1000.0)
  val account_2 = Account("002", 2000.0)

  println("\n-------------------------------------------------------------------------")
  println("Accounts : ")
  println(account_1)
  println(account_2)

  println("\n-------------------------------------------------------------------------")
  println("Transfer 500.00 to account 002")
  account_1.transfer(500.0, account_2)

  println("\n-------------------------------------------------------------------------")
  println("After transfer : ")
  println(account_1)
  println(account_2)
}