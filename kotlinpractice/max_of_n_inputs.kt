fun main(){
    var n=readLine()!!.toInt()
    val array=Array(n,{i->i})
    for(i in 0..(n-1)){
        array[i]=readLine()!!.toInt()
    }
    var maximum=array[0]
    for(i in 1..(n-1)){
        if(maximum<=array[i]){
            maximum=array[i]
        }
    }
    println(maximum)
}