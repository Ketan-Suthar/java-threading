# java collection


- Problems with arrays
- type
- size
- in-built method
- retrieval format
- same order



Collections
- Set, SortedSet, NavigableSet
  - unique without any order - HashSet
  - unique in insertion order - LinkedHashSet
  - unique in sorted order - TreeSet
  - unique, only one enum named constant - EnumSet
- List
  - duplicate with thread safety - Vector
  - duplicate without thread safety - ArrayList
  - duplicate with insertion order - LinkedList
  - duplicate in LIFO - Stack
- Queue and Deque
  - LIFO or FIFO at begging - PriorityQueue
  - LIFO or FIFO at both end - ArrayDeque

- Map, SortedMap, NavigableMap
- storing entries in hash code order - HashMap
- storing entries in insertion order - LinkedHashMap
- storing entries in sorting order - TreeMap
- storing entries only one enum names constant - EnumMap

- storing entries with weak reference - WeakHashMap
- storing entries with identity hash code - IdentityHashMap
- storing entries with thread safety - HashTable
- storing entries to store them permanently in a file - Properties


### Question for collection
- What is Vector 
- In which version it is defined? 
- When we must use vector? 
- Is it synchronized or not? 
- Is it ordered collection? 
- What is implemented data structure? 
- What is the default capacity, incremental capacity? 
- What type of elements are allowed to store? 
- Is null allowed,how many? 
- In which order elements are stored? 
- In which order elements are retrieved? 
- implicitly calling methods and those are executing from adding object class?

- TODO why serializable and cloneable not safe?

- To make any list thread safe, just wrap it like
  - Collections.synchronizedList(_list);


### hashCode and equals
- if equals return true for e1 and e2 then their hashCode MUST be same.
- if equals return false for e1 and e2 then their hashCode MAYBE same.
- if hashCode of e1 and e2 is same then equals MAYBE same.
- if hashCode of e1 and e2 is NOT same then equals MUST return false.
- how satisfy above condition, field used in hashCode must be used in equals.
- if different hashCode for all object generated then we can not stop data wise duplication.
- same hashCode for every object - it's worst
- 


## Vector
- legacy collection
- thread safe
- implemented using growable array
- default capacity 10
- increment by double OR +1
- allow null, multiple nulls
- maintains insertion order
- can retrieve in random and sequential order
- for search or sort it uses equal method
- Constructors
  - Vector()
  - Vector(Collection<? extends E)
  - Vector(int intCapacity)
  - Vector(int intCapacity, int capacityIncrement)


## ArrayList
- Collection framework collection
- since 1.1
- all methods are same as Vector but not thread safe
- default capacity 10
- increment by half OR +1


## LinkedList
- implemented using doubly linked list


## Stack
- internally use Vector


## Set
- internal data structure HashTable and bucket
- HashSet
  - use hashCode() for comparison


### HashSet


### TreeSet
- only homogeneous elements are allowed
- null not allowed
- sorted order
- custom class must override comparable
  - if return +ve value insertion order
  - if return -ve value reverse insertion order


## Map
- internal data structure HashTable and bucket
- bucket
  - is maintained using linked list
  - bucket identity is hashCode, so bucket is group of objects who's hashCode is same.
  - If hashCode is same then it first check reference using == 
    - then it checks using equals()
  - As many new objects with same hasCode is put, those many buckets will be created.
  - if linked list size of particular bucket exceeds the threshold then linked list will be converted into Binary Tree 


### HashMap
- to check duplicate is internally uses
  - hashCode(), == and equals() 
- default capacity 16


### LinkedHashMap
- hello


## TODO cursor object classes
- using get
- Enumerator - not recommended instead use Iterator
- Iterator
- ListIterator
- SplitIterator
- for each loop
- forEach
- stream API

- fail safe cursor
- fail fast cursor
- can not modify collection while iterating using cursor.
  - it uses modCount 
