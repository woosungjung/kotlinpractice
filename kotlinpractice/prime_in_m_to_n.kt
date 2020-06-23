fun main(){
    val(m,n)=readLine()!!.split(' ').map(String::toInt)
    val prime=BooleanArray(n){_->true}
    val sqrt=Math.sqrt(n.toDouble())
    for(i in 2..n){
        if(prime[i-1]){
            
            if(i<=sqrt){
                var j=i*i
                while(j<=n){
                    prime[j-1]=false
                    j+=i
                }
            }
        }
    }
    prime[0]=false
    for(i in 0..(m-2)){
        prime[i]=false
    }
    for(i in 0 .. (n-1)){
        if(prime[i]){
            println(i+1)
        }
    }
}