package BootlegList

class BootlegList (private var values: Array<Int> = Array(0){0}){
    private var queue = Array(0){0}

    val isEmpty: Boolean
        get(){
            update()
            return values.isEmpty()
        }

    val size: Int
        get() {
            update()
            return values.size
        }

    val toArray: Array<Int>
        get() {
            update()
            return values
        }



    operator fun get(index: Int): Int{
        update()
        return values[index]
    }

    fun indexOf(number: Int): Int{
        update()
        return values.indexOf(number)
    }

    fun lastIndexOf(number: Int): Int{
        update()
        return values.lastIndexOf(number)
    }

    fun contains(number: Int): Boolean{
        update()
        return values.contains(number)
    }

    operator fun set(number: Int, index: Int){
        update()
        if (index > size || index < 0)
            throw ArrayIndexOutOfBoundsException()
        else
            values[index] = number
    }

    fun add(number: Int){
        queue += number
    }

    private fun update(){
        values += queue
        queue = Array(0){0}
    }

    fun clear(){
        values = Array(0){0};
        queue = Array(0){0}
    }


}
