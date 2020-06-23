fun main(){
    var n= readLine()!!.toInt()
    val array=Array(n,{i->i})
    for(i in 0..(n-1)){
        println(array[i])
    }
}