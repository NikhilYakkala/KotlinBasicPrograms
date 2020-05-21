data class Seats(var name : String,var price : Int)
{
    object Bus
    {
        var seats = arrayListOf<Seats>()
        fun showSeats()
        {
            for (i in seats)
            {
                println(i)
            }
        }
    }
}
fun main(args:Array<String>)
{
    Seats.Bus.seats.add(Seats("Nikhil",1500))
    Seats.Bus.seats.add(Seats("Lakshmi",1200))
    Seats.Bus.seats.add(Seats("Trinadh",1800))

    Seats.Bus.showSeats()
}

//Object Keyword is nothing but singleton class in java.
//No need to create object for singleton class it will automatically created by JVM with classname