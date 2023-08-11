fun main(args: Array<String>) {

    var num=5
    if (num>10){
        println("The num is greater.")
    }
    else {
        println("The num is less.")
        }
    //if..elseif else statement
    val nambari=89
    if (nambari<0){
        println("Its a negative number")
    }else if (nambari>0 && nambari<10)
        println("Its a one digit number")
    else if (nambari>=10 && nambari<100)
        println("Its a double digit number")
    else
        println("It has 3 or more digits")

    //create such as the above to check marks as pass,fail,distinction and credit.

    val score=89
    if (score<40){
        println("The grade is Fail.")
    }else if (score>=40 && score<=60)
        println("The grade is Pass.")
    else if (score>60 && score<80)
        println("The grade is Credit.")
    else
        println("The grade is Distinction.")
    }




