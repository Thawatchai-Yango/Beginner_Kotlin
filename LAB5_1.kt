import java.time.LocalDate //funtion
import java.util.*

fun main(){
    //print("Enter M D : ")
    //var sc =Scanner(System.`in`)
    //var x = sc.nextInt()
    //var y = sc.nextInt()

    print("Enter month ")
    val x = readLine()!!.toInt() //5
    print("Enter date ")
    val y = readLine()!!.toInt() //12
    val date = LocalDate.of(2021, x, y) //2021,5,12
    println("Day = ${date.getDayOfWeek()}")

}