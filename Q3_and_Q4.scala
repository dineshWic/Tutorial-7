class Q3_and_Q4 {
  class account(nic_no:String,Acc_no: Int, balance: Double) {
    val nic : String= id;
    val Ac_no : Int = Acc_no;
    val t : Double = balance;

    def withdraw(w:Double) = this.balance = this.balance - w;
    def deposit(d:Double) = this.balance = this.balance + d;

    def transfer(a: account, trance: Double): Unit ={

      if(this.balance>trance)
      {
        this.balance = this.balance - trance;
        a.balance = a.balance + trance;
      }

      else
      {
        println("The balance is not enough .");
      }
    }

    var bank: List[account] = List();

    // 4.1

    val negative_b =(b:List[Account])=> b.filter(x => -x)

    //4.2

    val t_balance = (bank:List[Account]) => bank.reduce((a,b) => a+b

    //4.3

    val interest=(bank:List[Account])=>bank.map


  }
}
