package BootlegList

fun main(){
    val wal = BootlegList(arrayOf(1,2,3))

    println("normalni testy jsem rozbil")
    for (i in 0 until wal.size){
        print("${wal[i]} ")
    }
    println()

    println("add: ")
    wal.add(5)
    wal.add(6)
    for (i in 0 until wal.size){
        print("${wal[i]} ")
    }
    println()
    println("clear + is empty: ")
    println(wal.isEmpty)
    wal.clear()
    println(wal.isEmpty)

}
