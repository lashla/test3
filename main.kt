fun main() {
    var num1 = readLine()!!.toString()
    println(comp(num1))
}
fun comp (num1: String): String{
   var sum: Int = 1;
   var num2 = num1;
    do{
    for (num in 1 until num2.length){
        sum *= num2[num].digitToInt()
   }
   num2 = sum.toString()
    } while (num2.length != 1)
    return num2
}
