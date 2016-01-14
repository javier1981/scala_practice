object Pruebas2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  println("Welcome to the Scala worksheet");$skip(115); 
  
 // var L: List[Int] = List(1,2,3)
 // println(4::L)
  
def g(pos:Int,v:Int):Any = {
if (pos% 2!=0)Nil
else v
};System.out.println("""g: (pos: Int, v: Int)Any""");$skip(110); 
  
def m(pos:Int,arr:List[Int]):List[Any]={
if (arr.length ==0) Nil
else g(pos,arr.head)::m(pos+1,arr.tail)
};System.out.println("""m: (pos: Int, arr: List[Int])List[Any]""");$skip(52); 
  
  
def f(arr:List[Int]):List[Any] = {
m(1,arr)
};System.out.println("""f: (arr: List[Int])List[Any]""");$skip(40); 
  

println(f(List(1,2,3,4,5,6,7,8,9)))}
  
  
}
