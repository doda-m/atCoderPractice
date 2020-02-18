class welcome constructor() {
    private var a: Int = 0
    private var b: Int = 0
    private var c: Int = 0
    private var s: String = ""

    fun read_input() {
        a = readLine()!!.toInt()
        val list = readLine()!!.split(' ').map(String::toInt)
        b = list.get(0)
        c = list.get(1)
        s = readLine().toString()
    }

    fun answer() {
        println("${a + b + c} $s")
    }

    fun reset_value(first: Int, second: Int, third: Int) {
        a = first
        b = second
        c = third
    }

    fun print_add() {
        println(a + b + c)
    }

    fun print_all() {
        println("$a $b $c $s")
    }

}