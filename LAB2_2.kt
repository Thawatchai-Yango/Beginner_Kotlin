fun main()
{
    println("*** Welcome to Multiplication Table calculator *** ")
    print("Please enter input number : ")
    val multiplyValues = readLine()!!.toInt() //get input from user and convert to Int
    // all multiply function up-to 12 using for loop
    for( i in 1..12)
    {
        val product = multiplyValues * i
        println("$multiplyValues x $i = $product")
    }
    println("===== Thank You =====")
}
/* OUTPUT
*** Welcome to Multiplication Table calculator ***
Please enter input number : 42
42 x 1 = 42
42 x 2 = 84
42 x 3 = 126
42 x 4 = 168
42 x 5 = 210
42 x 6 = 252
42 x 7 = 294
42 x 8 = 336
42 x 9 = 378
42 x 10 = 420
42 x 11 = 462
42 x 12 = 504
===== Thank You =====
 */