import java.util.Scanner
fun main(){
    val read=Scanner(System.`in`)
    var num=read.nextInt()
    for(i in 1..9){
        var result=num*i
        println("$num*$i=$result")
    }

}