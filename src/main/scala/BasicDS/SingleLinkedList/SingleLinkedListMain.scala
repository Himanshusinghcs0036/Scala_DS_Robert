package BasicDS.SingleLinkedList

object SingleLinkedListMain {

  def main(args: Array[String]): Unit = {
    val ob: SinleLinkedListImpl = new SinleLinkedListImpl()
    //ob.show()
    ob.insert("SKKJ")
    ob.insert("Test")
    ob.insert("Test1")
    ob.insert("Test6")
    ob.insert(2,"Node 2")
    ob.insert("Test5")
    ob.show()

    println("==============================")
    ob.remove(2)
    ob.remove(2)
    ob.show()
  }
}
