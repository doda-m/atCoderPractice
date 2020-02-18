class product {
    var a: Int = 0
    var b: Int = 0

    fun read_input() {
        val list = readLine()!!.split(' ').map(String::toInt)
        a = list.get(0)
        b = list.get(1)
    }

    fun answer() {
        val mul = a * b
        if (1 == mul % 2) {
            println("Odd")
        }
        else {
            println("Even")
        }
    }
}