

/**
 * @author javier
 */
object FilterArray {
  
 def f(delim:Int,arr:List[Int]):List[Int] = {
 if (arr.length ==0) Nil    
 else if (arr.length == 1 && arr.head <  delim) arr.head::List()
 else if (arr.length > 1 && arr.head >  delim) f(delim,arr.tail)
 else if (arr.length > 1 && arr.head <  delim) arr.head::f(delim,arr.tail)
 else  f(delim,arr.tail)
} 
 
 def main(args: Array[String]) {
// println ("hola") 
   println(f(5,List(1,2,3,7,8,9,4)))
    }

 
}