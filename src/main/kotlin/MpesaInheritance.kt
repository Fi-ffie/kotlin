open class MpesaAccount(val phoneno:String,var balance:Double) {

    open fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited $amount into account $phoneno.New balance is $balance")
        } else {
            println("Invalid deposit")
        }
    }

    open fun withdraw(amount: Double){
        if (amount > 0 && amount <= balance){
            println("Withdrawn $amount from account $phoneno.Balance:$balance")
        }else{
            println("Insufficient balance")
        }
    }
}

class checkbalance(phoneno: String,balance: Double):MpesaAccount(phoneno,balance) {
    fun sendmoney(receiverPhone: String, amount: Double) {
        if (amount > 0 && amount <= 0) {
            balance -= amount
            println("Sent $amount to account $receiverPhone. Balance :$balance")
        }else{
            println("Insufficient balance")
        }
    }
}

fun main(args: Array<String>) {
    val useraccount=checkbalance("0736363368",5000.0)
    val receiveraccount=checkbalance("0746577423",9000.0)

    useraccount.deposit(2000.0)
    useraccount.withdraw(600.0)
    useraccount.sendmoney(receiveraccount.phoneno,100.0)
}