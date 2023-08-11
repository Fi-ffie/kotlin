class computer{
    var brand=""
    var price=0
    var specs=""
}

fun main(args: Array<String>) {
    val myobj=computer()
    myobj.brand="Hewlett pack"
    myobj.price=80000
    myobj.specs="core i7 512 ssd 16gb Ram"
    println("My laptop is ${myobj.brand}. It is ${myobj.specs} and costs ${myobj.price}")
}