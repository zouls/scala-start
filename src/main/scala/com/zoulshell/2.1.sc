var x = -10
var a = if (x > 0) 1 else 0



var b = if (x > 2) "" else 0
var c = if (x > 2) ""


if (x > 0) 1
else if (x < 0) 2
else 3


var d = 3 + 10 -
  3 *
    9


printf("hello, %s ======> %d", "kfjdkfj", 65465)

for (i <- 1 to 10) a += i
print(a)

for (i <- 1 to 10) a += i
print(a)

var s = "fdkjfkasdjfkjasdkfjkas"
var z = "z"
for (i <- 0 until s.length) z += i
print(z)

for (i <- 1 to 3; j <- 1 to 3) print((i + j * 10) + " ")
for (i <- 1 to 3; j <- 1 to 3; if i != j) print((i + j * 10) + " ")


for (i <- 1 to 3; from = 4 - i; j <- from to 3) print((i + j * 10) + " ")

for {
  i <- 1 to 3
  from = 4 - i
  j <- from to 3
} print((i + j * 10) + " ")

for (c <- "hello"; i <- 0 to 1) yield (c + i).toChar

for (i <- 1 to 10) yield i % 3

def abs(x: Double) = if (x > 0) x else -x

var resaaa = abs(-5)

def aaa(x: Int): Int = {
  var y = 2
  y = x * y
  y
}

var temp111 = aaa(999)

def fac(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)

var ttt = fac(10)

def dec(str: String, left: String = "[", right: String = "]") = {
  left + str + right
}
var tt = dec("hello")

var t = dec("hi", "{", "}")

var tttt = dec("maybe", right = "(", left = ")")

def sum(args: Int*) = {
  var result = 0
  for (arg <- args) result += arg
  result
}

val j = sum(1, 4, 6, 7, 65, 7, 8, 19)
val jj = sum(1 to 10: _*)

def recursiveSum(args: Int*): Int = {
  if (args.isEmpty) 0
  else args.head + recursiveSum(args.tail: _*)
}
recursiveSum(2 to 100: _*)

















