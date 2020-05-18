data class User(var username : String,var password:String) {
    fun printUserData() {
        println("$username and $password")
    }
}
fun main(args:Array<String>)
{

    var u = User("nikki","nikki_123")
    var u1 = User("nikki","nikki_123")
    println("$u  $u1")
    println(u==u1)
    println(u.equals(u1))
    var u3 = u.copy()
    println(u3)
}
