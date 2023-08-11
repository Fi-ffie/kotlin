fun complexcal(){

    println("Complex Calculator")
    println("Enter First Number")
    val num1= readLine()?.toDoubleOrNull()

    println("Enter the operator (+,-,*,/):")
    val operator= readLine()

    println("Enter Second Number")
    val num2= readLine()?.toDoubleOrNull()

    if (num1==null||operator==null||num2==null){
        println("Invalid input.Please put correct numbers and operator")
        return
    }
    val results=when(operator){
        "+"->num1+num2
        "-"->num1-num2
        "*"->num1*num2
        "/"-> if (num2 !=0.0)num2+num2 else "You cant divide by zero"
        else->"Invalid operator"
    }
    println("Answer is $results")
}
fun main(args: Array<String>) {
    complexcal()
}