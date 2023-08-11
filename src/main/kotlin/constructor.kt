class Wanafunzi(val jina:String,var miaka:Int){

}
class Walimu(val jina:String,var miaka:Int, val jinsia:String){

}

fun main(args: Array<String>) {
    val mimi=Wanafunzi("Erick",30)
    println("Stud Name is : ${mimi.jina} and age is ${mimi.miaka}")
    val yeye=Walimu("Halima",34,"Female")
    println("Stud Name is : ${yeye.jina} age is ${yeye.miaka} and gender is ${yeye.jinsia}")

}