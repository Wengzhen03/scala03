object  test {

  def main(args: Array[String]) {

    //val x=1
    //val y = if (x > 0) 1 else -1
    //println(y)


    //for(i <- 表达式),表达式1 to 10返回一个Range（区间）
    //每次循环将区间中的一个值赋给i
    //for (i<-3 to 10 )
      //print(i)

    //for(i <- 数组)
   // val arr = Array("a","b","c")
    //for (i<-arr)
      //print(i)

    //高级for循环
    //每个生成器都可以带一个条件，注意：if前面没有分号
    for (i <- 1 to 3; j <- 1 to 3 if i !=j)
      print((10 * i + j)+" ")
    println()

  }

}
