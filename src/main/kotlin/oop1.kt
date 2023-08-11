class People(val name:String,val age:Int, val gender:String){
//    member function for intro
    fun jitambulishe(){
        println("Hi my name is $name and im $age years old $gender.")
    }
//    member function to have a birthday
    fun havebirthday(){
 //       age++
    println("$name just turned $age")
    }
}

fun main(args: Array<String>) {
//    create an instance(objects) of the class
    val watu=People( "John", 45, "Male")
    watu.jitambulishe()
    watu.havebirthday()

    val watu1=People( "Sofia", 32, "Female")
    watu1.jitambulishe()
    watu1.havebirthday()

    val watu2=People( "Angelo", 29, "Male")
    watu2.jitambulishe()
    watu2.havebirthday()
}