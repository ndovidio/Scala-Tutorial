var capital = Map("US" -> "Washington", "France" -> "Paris")

capital += ("Japan" -> "Tokyo")

println(capital("France"))

def factorial(x: BigInt): BigInt = {
  if(x == 0)1 else x * factorial(x-1)
}

factorial(30)

val xs = 1 to 3
val it = xs.iterator
//eventually { it.next() shouldBe 3}

class MyClass(index: Int, name: String){

}

val nameHasUpperCase = "asdfafAb".exists(_.isUpper)

1+1

