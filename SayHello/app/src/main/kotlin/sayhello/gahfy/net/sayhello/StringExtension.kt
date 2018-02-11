package sayhello.gahfy.net.sayhello

fun String?.addHelloPrefix():String{
    return "Hello"+(if (this?.length?:0 > 0)  " "+this else "")
}