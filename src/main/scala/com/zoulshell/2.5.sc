import scala.util.control.Breaks._

var sum = 1
for (i <- 1 to 10)
  sum += i
sum

val s = "hello"
var num = 0
for (i <- 0 until s.length)
  num += s(i)
num

var num2 = 0
for (ch <- "hello")
  num2 += ch

num2



// break 要导入包来实现
breakable {
  for (i <- 0 to 10) {
    if (i == 5) break
    sum += i
  }
}

// 遮挡规则生效,可以这样定义n,这在java中是不可以的
val n = 10
for (n <- 1 to 10)
  num += n

