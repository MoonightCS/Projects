class Node:
  def __init__(self, data, next):
    self.data = data
    self.next = next

n1 = Node("Bogdan", None)
n2 = Node("Dima", n1)
n3 = Node("Evgeniy", n2)
n4 = Node("Pasha", n3)
n5 = Node("Vadim", n4)
n6 = Node("Slava", n5)
n7 = Node("Nikita", n6)

head = n7
fastPointer = head
slowPointer = head

while fastPointer.next is not None and fastPointer.next.next is not None:
    fastPointer = fastPointer.next.next
    slowPointer = slowPointer.next

print slowPointer.data
