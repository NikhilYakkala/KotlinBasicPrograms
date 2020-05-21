//Anonymous Inner Class Example in kotlin
interface Driver
{
    fun drive()
}
fun main(args : Array<String>)
{
    var d : Driver = object : Driver
                    {
                        override fun drive() {
                            println("Driving Car")
                        }
                    }
    d.drive()
}
/*AnonymousInnerClass Example in JAVA
interface Driver
{
    void drive();
}
public class AnonymousClassExample {
    public static void main(String[] args) {
        Driver d = new Driver() {
            public void drive() {
                System.out.println("Driving Car");
            }
        };
        d.drive();
    }
}
*/
