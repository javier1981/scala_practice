object Pruebas2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
 // var L: List[Int] = List(1,2,3)
 // println(4::L)
  
def g(pos:Int,v:Int):Any = {
if (pos% 2!=0)Nil
else v
}                                                 //> g: (pos: Int, v: Int)Any
  
def m(pos:Int,arr:List[Int]):List[Any]={
if (arr.length ==0) Nil
else g(pos,arr.head)::m(pos+1,arr.tail)
}                                                 //> m: (pos: Int, arr: List[Int])List[Any]
  
  
def f(arr:List[Int]):List[Any] = {
m(1,arr)
}                                                 //> f: (arr: List[Int])List[Any]
  

println(f(List(1,2,3,4,5,6,7,8,9)))               //> List(List(), 2, List(), 4, List(), 6, List(), 8, List())
  
  
}