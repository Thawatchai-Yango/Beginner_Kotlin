import java.util.*

fun main(){
    print("Enter X Y ")
    var sc =Scanner(System. `in`)

    var x = sc.nextInt() //5
    var y = sc.nextInt() //11

    var time = y/x  // 10/5 = 2

    if(y%x!=0){ //11/5=0
        time++
    }

    println("time = $time") //2
}