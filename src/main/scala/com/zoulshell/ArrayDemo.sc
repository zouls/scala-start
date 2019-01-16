// defined
val nums = new Array[Int](10)
val ss = new Array[String](10)
val sss = Array("hello", "world")
sss(0) = "hi"
sss


import scala.collection.mutable.ArrayBuffer

val b = ArrayBuffer[Int]()
b += 1
b += (1, 2, 3, 5)
b ++= Array(8, 9, 3)
b.trimEnd(5)
b.insert(2, 6)
b.insert(2, 7, 8, 9)
//b.remove(2)
//b.remove(2, 3)
//b.toArray

for (i <- b.indices) println(i + ": " + b(i))
for (i <- b.indices.reverse) println(i + ": " + b(i))
for (i <- b) println(i)

val a = Array(2, 3, 4, 5, 11)
val result11 = for (ele <- a) yield 2 * ele
val res111 = for (ele <- a if ele % 2 == 0) yield 2 * ele
val res2 = a.filter(_ % 2 == 0).map(2 * _)

Array(1, 34, 6, 3).sum
Array(1, 34, 6, 3).max
Array(1, 34, 6, 3).min

val aaa = ArrayBuffer(1, 34, 6, 3)
//aaa.sorted()
aaa.sortWith(_ > _)
aaa.sortWith(_ < _)

//scala.util.Sorting.quickSort(aaa)
aaa.mkString("<", ",", ">")
aaa.toString()
b.toString()


var matrix = Array.ofDim[Int](3, 4)
matrix(2)(1) = 10
matrix


// 二维数组包含不同的length的数组
var matrix2 = new Array[Array[Int]](3)
for (i <- matrix2.indices)
  matrix2(i) = new Array[Int](i + 1)
matrix2














