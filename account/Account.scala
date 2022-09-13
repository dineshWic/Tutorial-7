package account
case class Account(acc: String, bal: Double) {
  var accountNo = acc
  var balance = bal

  def withdraw(amount: Double) = balance = balance - amount

  def deposit(amount: Double) = balance = balance + amount

  def transfer(amount: Double, toAccount: Account) = {
    balance = balance - amount
    toAccount.balance = toAccount.balance + amount
  }

  def isNegativeBalance() = if (balance < 0) true else false

  def addInterest(depositRate: Double, overdraftRate: Double) = balance = balance * (1 + (if(isNegativeBalance()) overdraftRate else depositRate))

  override def toString = "\nAccount : " + accountNo + "\nBalance : " + balance
}

