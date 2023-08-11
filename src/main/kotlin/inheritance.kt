open class Animal(val name:String){
    open fun makesound(){
        println("$name makes a sound")
    }
}
class Cat(name: String):Animal(name){
    override fun makesound(){
        println("$name meows")
    }
}
class Dog(name: String):Animal(name){
    override fun makesound(){
        println("$name barks")
    }
}
class Rabbit(name: String):Animal(name) {
    override fun makesound() {
        println("$name squeaks")
    }
}

fun main(args: Array<String>) {
    val dog=Dog("Barol")
    val cat=Cat("Whiskers")
    val rabbit=Rabbit("Fluffy")

    dog.makesound()
    cat.makesound()
    rabbit.makesound()

}
