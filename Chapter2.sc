1+2

println("Hello, world!")



val msg = "Hello"
val msg2: String = "Hello"
println(msg + msg2)


def max(x: Int, y:Int): Int = {
  if(x>y) x
  else y
}

max(4,2)
//Recursive functions must specify result

def green() = println("Hello")

green()

var i = 0

while (i < 3){
  println(i)
  i += 1
}

