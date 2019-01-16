for (i <- 1 to 3; j <- 1 to 3) print(f"${10 * i + j}%3d")
// 带守卫,守卫之前不要分号 Boolean表达式
for (i <- 1 to 3; j <- 1 to 3 if i != j) print(f"${10 * i + j}%3d")



for (i <- 1 to 10) yield i % 3
// 为何会有String和char数组生成的差异
for (c <- "hello"; i <- 0 to 1) yield (c + i).toChar
for (i <- 0 to 1; c <- "hello") yield (c + i).toChar
for (c <- "hello"; i <- 0 to 1) yield c + i
for (i <- 0 to 1; c <- "hello") yield c + i