
fun findPrimeNo(number: Long): Boolean {//number =9
    if(number<2) return false
    for (i in 2..number/2) {  //2..3
        if (number % i == 0.toLong()) { //9/2=2
            return false
        }
    }
    return true
}

fun main(arg: Array<String>) {
    println("=== Prime number ===")

    print("Input a : ")
    var a = readLine()!!.toLong()//

    print("Input b : ")
    var b = readLine()!!.toLong()

    var list = arrayListOf<Long>()//[5,7]

    for (i in a..b) {   // 5..10
        if (findPrimeNo(i)) {   //findPrimeNo(9)
            list.add(i) //add(5) add(7)
        }
    }

    println("The Prime number between $a and $b  : $list")//[5,7]
    println("The number of Prime number between $a and $b is ${list.size}") //2
}

/*OUTPUT
=== Prime number ===
Input a : 1
Input b : 100
The Prime number between 1 and 100  : [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
The number of Prime number between 1 and 100 is 25
 */
