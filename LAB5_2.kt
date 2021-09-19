fun main(){

    print("Enter string: ")
    var input = readLine()!!.toString()

    val code = arrayOf("apa","epe","ipi","opo","upu","mut")
    val replace = arrayOf("0","1","2","3","4","HEllO")

    for(i in code.indices){ //0..4
        input = input.replace(code[i].toString(),replace[i].toString())
    }
    println(input)
}