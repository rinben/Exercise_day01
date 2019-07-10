object Exercises {
  def main(args: Array[String]): Unit = {
    //Exercise 1
    println(nameAge("Benjamin Rinaldo",19))
    println(nameAge("Benjamin Rinaldo",65))
    println(nameAge("Benjamin Rinaldo",95))
    println()
    //Exercise 2
    println(max(44,77))
    println()
    //Exercise 3
    println(summer_winter(15))
    println(summer_winter(33))
    println(summer_winter(97))
    println(summer_winter(100))
    println()
    //Exercise 4
    println(speed_checker(60))
    println(speed_checker(90))
    println(speed_checker(119))
    println(speed_checker(120))
    println()
    //Exercise 5
    println(oddEven(7))
    println()
    //Exercise 6
    println(sum(20))
    println(sum(28))
    println(sum(96))
    println()
    //Exercise 7
    println(prime_num(7))
    println(prime_num(49))
    println(prime_num(97))
    println(prime_num(1237))
    println()
    //Exercise 8
    println(prime_list(100))
    println()
    //Exercise 9
    println(sort(1,2,3))
    println(sort(2,3,1))
    println(sort(3,1,2))
    println(sort(1,3,2))
    println(sort(3,2,1))
    println(sort(2,1,3))
    println()
    //Exercise 10
    println(perfectNumber(28))
    println(perfectNumber(272))
    println(perfectNumber(496))
    println(perfectNumber(8128))
    println()
  }
  //Exercise 1
  def nameAge(name:String, age:Int):String = {
    val year65=2019+64-age
    if (year65>2019){
      "Hello, %s. You will turn 65 in the year %d.".format(name, year65)
    }
    else{
      "Hello, %s. You turned 65 in the year %d.".format(name, year65)
    }
  }
  //Exercise 2
  def max(x:Int, y:Int):Int={
    if(x>y)
      x
    else {
      y
    }
  }
  //Exercise 3
  def summer_winter(x:Int):String = {
    if (x%3==0){
      if (x%5==0){
        return "SummerWinter"
      }
      return "Summer"
    }
    if (x%5==0){
      "Winter"
    }
    else{
      ""+x+""
    }
  }
  //Exercise 4
  def speed_checker(speed:Int):String = {
    if (speed<55) {
      return "Ok"
    }
    if (speed%5>0){
      val p=Math.floorDiv(speed-55,5)
      if (p>12){
        return "License Suspended"
      }
      "Points: "+p
    }
    else {
      val p = (speed-55) / 5
      if (p>12){
        return "License Suspended"
      }
      "Points: "+p
    }
  }
  //Exercise 5
  def oddEven(limit:Int):Unit ={
    for (i<- 0 to limit){
      var s="EVEN"
      if (i%2!=0){
        s="ODD"
      }
      println("%d%s".format(i, s))
    }
  }
  //Exercise 6
  def sum(limit:Int):Int = {
    var retSet=Set[Int]()
    if (limit > 3) {
      var i=1
      while ((3*i)<=limit){
        retSet=retSet.+ (3*i)
        if ((5*i)<=limit) {
          retSet = retSet.+ (5*i)
        }
        i = i + 1
        }
    retSet.sum
    }
    else{
      0
    }
  }
  //Exercise 7
  def prime_num(num:Int):Boolean = {
    var bool=true
    for (i<- 2 until num){
      if (num % i == 0) {
        bool = false
      }
    }
    bool
  }
  //Exercise 8
  def prime_list(limit:Int):List[Int]= {
    var ret_list=List[Int]()
    for (i:Int<-2 to limit if prime_num(i)){
      ret_list=ret_list.appendedAll(List(i))
    }
    ret_list
  }
  //Exercise 9
  def sort(x:Int, y:Int, z:Int): String = {
    if (x >= y && x >= z) {
      if (y >= z) {
        z + "," + y +  "," + x
      }
      else {
        y + "," + z + "," + x
      }
    }
    else if (y >= x && y >= z) {
      if (x >= z) {
        z + "," + x +  "," + y
        }
      else {
        x + "," + z + "," + y
        }
      }
    else {
      if (y >=x ){
        x + "," + y +  "," + z
      }
      else {
        y + "," + x + "," + z
      }
    }
  }

  //Exercise 10
  def perfectNumber(x:Int): String = {
    val divisors = new Array[Int](x)
    var sum = 0
    for (i <- 0 until x){
      if (i !=0 && x%i == 0 ){
        divisors(i) = i
      }
      else{
        divisors(i) = 0
      }
    }
    for (k <- 0 until x){
      if (divisors(k) !=0 && x%divisors(k) == 0) {
        sum = sum + divisors(k)
      }
    }
    if (sum == x){
      "true"
    }
    else {
      "false"
    }
  }
}
