

/**
 * @author javier
 */
/*Given a list repeat each element of the list n times
Input Format 
First line has integer S where S is the number of times you need to repeat elements.
After this there are X lines, each containing an integer. These are the X elements of the array.

Output Format 
Repeat each element of the original list S times. 
So you have to return list/vector/array of S*X integers. The relative positions of the 
values should be same as the original list provided as input.
* 
*/
object ListReplication {

// genera una lista de n veces el elemento v.
// Tendremos una lista de v repetido n veces.  
def g(n : Int,v : Int, L: List[Int]) : List[Int] ={
if (n==1 ) v::L
else g(n-1,v,v::L)
  }  

/* Toma la cabecera y recorre el resto de la lista aplicando
  g() al resto de los elementos de la lista
*/
def f(num:Int,arr:List[Int]):List[Int] ={
  if (arr.length == 1)  g(num,arr.head,List())
  else
  g(num,arr.head,List()):::f(num,arr.tail)
  }   
def main(args: Array[String]) {
// println ("hola") 
   println(f(5,List(3,2,3,7,8,9,4)))
    }
}