class marbles {
    var list: List<Int> = mutableListOf(3)

    fun read_input() {
        val fld: String = readLine()!!.toString()
        list = fld.split("").filter { it != "" }.map(String::toInt)
    }

    fun answer() {
        var count: Int = 0

        for (input in list) {
            if (1 == input) {
                count = count + 1
            }
        }
        println("$count")
    }
}