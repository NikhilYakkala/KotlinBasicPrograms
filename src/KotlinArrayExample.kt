import java.math.BigInteger

fun main(args:Array<String>) {

    var numbers = arrayOf<Int>(6,8,3,5,2)
    for(i in 0..numbers.size-1)
    {
        println("Array with Range : "+numbers[i])
    }
    for(i in numbers.indices)
    {
        println("Array with indices : " +numbers[i])
    }
    println("Array Size is : "+numbers.size)

    numbers.set(4,50)

    println("Last element with last method : "+numbers.last())

    println(numbers[numbers.size-1])

    var states = arrayOf<String>("AP","Telangana","Tamil Nadu","Karnataka")

    var statesstarswithA = states.filter { it.startsWith("A") }

    var apstatetokerala = states.map { it.replace("AP","Kerala") }

    println(statesstarswithA)

    println(apstatetokerala)

    for(i in states) {
        println(i)
    }
     val values = intArrayOf(1,2,3,4,5)

     val productofvalues = values.reduce{product,next->product*next}

    println(productofvalues)

}