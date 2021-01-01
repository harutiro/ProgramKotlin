fun main(args: Array<String>) {
    //全く関係ない型への変換は、toから始まるメソッドが用意されてる
    val str = "64"
    val intVal:Int = str.toInt()
    println(intVal) 

    //全く関係ないものへの変換はエラーとなるときがある
    // val str2 = "kotlin"
    // val intVal2:Int = str2.toInt()
    // println(intVal2)

    //orNullと続くメソッドがあり、例外が発生したらNullを返してくれる
    val str3 = "kotlin"
    val intVal3:Int? = str3.toIntOrNull()
    println(intVal3)
}