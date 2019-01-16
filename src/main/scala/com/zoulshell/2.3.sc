import scala.math._

var x = 1
var x0 = 2
var y = 3
var y0 = 4

val distance = {val dx = x - x0; val dy = y - y0; sqrt(dx * dx + dy * dy)}

// 赋值语句的值为Unit, Java中的赋值语句的值为被赋值的那个值
{val a = 0; val b = 1}

var c = 5
var d = 6
// 报错Unit无法赋值给Int型的c
// c = d = 7








