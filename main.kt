fun main() {
    var enteredNumber = readLine()!!.toString()
    println(comp(enteredNumber))
}
fun comp (enteredNumber: String): String{
   var sum: Int = 1;
    var tempNumber = enteredNumber
    do {
        for (element in tempNumber) {
            sum *= element.toChar().digitToInt()
        }
        tempNumber = sum.toString()
        sum = 1
    } while (tempNumber.length > 1)
    return tempNumber
}
