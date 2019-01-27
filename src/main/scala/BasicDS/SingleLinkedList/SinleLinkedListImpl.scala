package BasicDS.SingleLinkedList

class SinleLinkedListImpl() {

  var head: SingleNode = new SingleNode()

  def insert(data: Any): Unit = {
    val newNode: SingleNode = new SingleNode()
    newNode.data = data
    if (head.data==null) {
      head=newNode
    } else {
      var currentNode: SingleNode = head
      while (currentNode.next != null) {
        currentNode = currentNode.next
      }
      currentNode.next = newNode
    }
  }

  def insert(position: Int, data: Any): Unit = {
    if (getSize() >= position) {
      var currentNode: SingleNode = head
      val newNode: SingleNode = new SingleNode()
      newNode.data = data
      var currentPos: Int = 1

      while (currentPos < (position - 1)) {
        currentPos += 1
        currentNode = currentNode.next
      }

      newNode.next = currentNode.next
      currentNode.next = newNode
    }else{
      println("Wrong location to insert node")
    }
  }

  def remove(position: Int): Unit = {
    if (head!=null & getSize() >= position) {
      var currentNode: SingleNode = head
      var currentPos: Int = 1
      while (currentPos != (position - 1)) {
        currentNode = currentNode.next
        currentPos += 1
      }
      currentNode.next = currentNode.next.next
    } else {
      println("No Node to remove: List Empty")
    }
  }

  def show(): Unit = {
    var currentNode: SingleNode = head
    while (currentNode!=null) {
      println(currentNode.data)
      currentNode = currentNode.next
    }

  }

  def getSize(): Int = {
    var currentNode: SingleNode = head
    var count = 0
    if(head==null){
      return 0
    }
    while (currentNode != null) {
      count += 1
      currentNode = currentNode.next
    }
    count+=1
    return count
  }


}
