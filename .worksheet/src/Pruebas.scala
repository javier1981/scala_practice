object Pruebas {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
  println("Welcome to the Scala worksheet");$skip(309); 
  
  
 def f(delim:Int,arr:List[Int]):List[Int] = {
 if (arr.length ==0) Nil
 else if (arr.length == 1 && arr.head <  delim) arr.head::List()
 else if (arr.length > 1 && arr.head >  delim) f(delim,arr.tail)
 else if (arr.length > 1 && arr.head <  delim) arr.head::f(delim,arr.tail)
 else  f(delim,arr.tail)
};System.out.println("""f: (delim: Int, arr: List[Int])List[Int]""");$skip(21); 
 

 println ("hola");$skip(35); 
 println(f(5,List(1,2,3,7,8,9,4)))}




}
