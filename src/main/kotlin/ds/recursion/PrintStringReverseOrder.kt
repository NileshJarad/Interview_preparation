package ds.recursion

fun main(){
    val data = "ABCDE"
    print("Reverse  of $data == ${PrintStringReverseOrder().revRecursion(data,data.length)}")
}
class PrintStringReverseOrder {

    fun revRecursion(data : String, len : Int) : String{
        if(len == 0){
            return ""
        }
        val sb = java.lang.StringBuilder()
        sb.append(data[len-1]);
        sb.append(revRecursion(data,len-1))
        return  sb.toString()
    }

}