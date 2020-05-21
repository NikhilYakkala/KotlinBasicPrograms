class M
{
    //Companion Object with Factory Design Pattern
    /*companion object {
        fun createObjectM(): M = M()
    }*/
    companion object
    {
        @JvmStatic
        fun show()
        {
            println("In Show Method from class M")
        }
    }
}
fun main(args : Array<String>)
{
    M.show()
    /*var m = M.createObjectM()
    m.show()*/
}