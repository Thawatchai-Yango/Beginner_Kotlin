
fun main() {
    print("Enter the started point(x,y) in table 8x8 : ")
    var p1 = readLine()!!.toInt()
    var p2 = readLine()!!.toInt()
    //Check whether the point is over 8by8 if overload the program will terminate
    if( p1>8 || p2>8) {
        println("!!!Error input!!!")
        println("!!!Close Program!!!")
        return
    }
    //Accept the amount of moves
    print("Enter number of amount you want to walk : ")
    val w = readLine()!!.toInt()
    //Enter the following path as describe
    println("\nPress following number to walk in a direction")
    println("(1:north, 2:south, 3:east, 4:west)")
    var list = arrayListOf<Int>()
    //val list: MutableList<Long> = ArrayList()
    //Accept the values of following and store in List
    for (i in 1..w) {
        print("Walk step $i : ")
        var walk = readLine()!!.toInt()
        list.add(walk)
    }
    //Print the path that you walk
    println("\n======> The path that you have walked")
    print("$p1  $p2")
    //Print all path
    for( i in 1..w) {
            //function if moves to north
            if (list[i-1] == 1) {
                val m = p2 + 1
                if (p1 > 8 || m > 8) {
                    print(" STOP\n")
                    p2 += 1
                    return
                }
                print("\n$p1  $m")
                p2 += 1
            }
            //function if moves to south
            if (list[i-1] == 2) {
                val m = p2 - 1
                if (p1 > 8 || m > 8) {
                    print(" STOP \n")
                    p2 -= 1
                    return
                }
                print("\n$p1  $m")
                p2 -= 1
            }
            //function if moves to east
            if (list[i-1] == 3) {
                val m = p1 + 1
                if (p2 > 8 || m > 8) {
                    print(" STOP \n")
                    p1 += 1
                    return
                }
                print("\n$m  $p2")
                p1 += 1
            }
            //function if moves to west
            if (list[i-1] == 4) {
                val m = p1 - 1
                if (p2 > 8 || m > 8) {
                    print(" STOP \n")
                    p1 -= 1
                    return
                }
                print("\n$m  $p2")
                p1 -= 1
            }
    }
}

/*OUTPUT 1

Enter the started point(x,y) in table 8x8 : 3 2
Enter number of amount you want to walk : 3

Press following number to walk in a direction
(1:north, 2:south, 3:east, 4:west)
Walk step 1 : 1
Walk step 2 : 3
Walk step 3 : 1

======> The path that you have walked
3  2
3  3
4  3
4  4 STOP

**OUTPUT 2
Enter the started point(x,y) in table 8x8 : 7 5
Enter number of amount you want to walk : 4

Press following number to walk in a direction
(1:north, 2:south, 3:east, 4:west)
Walk step 1 : 1
Walk step 2 : 3
Walk step 3 : 3
Walk step 4 : 1

======> The path that you have walked
7  5
7  6
8  6 STOP

 */