# java-threading

### Basics
- there is only one way we can create thread - by using new Thread(). its incomplete.
- by creating only Thread we cannot supply logic. 
- there are 3 ways we can supply logic to threads(after 1.5, before there we only 2 ways)
- so, totally there are 3 ways to create threads.
- extra alternate ways
  - outer class
  - anonymous inner class using thread
  - anonymous inner class using runnable
  - anonymous inner class using callable
  - lambda expression using runnable
  - lambda expression using callable
  - method reference using runnable
  - method reference using callable
- can create thread in 3 ways:
  - extending Thread class
  - implementing runnable class
  - implementing from callable using executor framework
- We should implement Runnable, it has advantages
  - We can extend other class, multiple inheritance
  - Thread creation logic and implementation logic is separate, parallel programming
- can call start() multiple times


### extending thread
- MyThread mt = new MyThread()
1. Thread, MY class loaded, static variables and static blocks are executed.
2. new instance is created with Thread and MyThread classes instance variables.
3. no param construction of Thread is called
   - thread class instance variables are assigned
   - default name = Thread-0
   - priority = parent thread's priority(5)
   - daemon = parent thread's value(false)
   - group = parent thread's group(main)
   - target = null
   - threadStatus = 0
4. after thread object is created, when start() is called, its logic is loaded and executed in main thread, and it requests JVM to start custom thread for the object mt by loading the run() method of mt object class MyThread. 
5. after Custom Thread is made ready to execute start() method changes threadStatus and return to calling method. 
6. then calling methods logic is continued. 
7. when calling thread logic is completed, or it is paused, custom thread execution is started and run concurrently with other threads. 
8. Thread class  2 relationship with Runnable, is-a and has-a. 
9. Can call start method only once.
10. run() method is not called from start, JVM call it. 


### how many ways we can create multiple thread
- single subclass, multiple instances - for executing same logic.
- multiple subclass, multiple instances - for executing different logic.


### Thread life cycle 
1. New
   - Thread mt = new Thread()
2. Ready-to-Run/Runnable 
   - mt.start()
3. Running
4. Non-runnable/Blocked
    - When paused/Lock acquisition
      - sleep()
      - join(time)
      - wait(time)
      - join()
      - wait
      - synchronized
5. Dead
    - when completed execution

#### officially from java 5 new names introduced
1. NEW
2. RUNNABLE
3. TIMED_WAITING
4. WAITING
5. BLOCKED
6. TERMINATED

- if thread is in NEW OR TERMINATED state then it is not alive else it is alive.

### Thread execution algorithms
- Threads are executed by Thread Scheduler(OS program)
- It executed by two algorithms
  - Thread Scheduling
  - Thread Priority
- Thread execution is paused by 
  - Thread Scheduling
  - Calling Thread methods like sleep, wait etc.
- Thread come to Ready-to-run state by
  - Thread Scheduler
  - by calling yield() method of Thread class
- High priority thread will be picked first. 
- If same priority thread picked randomly.

- Thread.currentThread() return current Thread in which code is running.
  - used to get Thread in normal object
  - Or to get main Thread


### TODO search about ThreadGroup


### daemon and non-daemon thread
- if there is not a single non-daemon thread running jvm will shut down, even though daemon thread execution is not completed
- Can we guarantee daemon execution 100%? - No
- Type depends on parent thread
- By default, all thread are non-daemon because main thread is non-daemon
- How jvm can recognize thread as daemon or non-daemon - isDaemon() 
- How to create daemon thread?
  - setDaemon(true)
- Can we call setDaemon in any state?
  - No, must call before start() call


### methods to control Thread execution
- yield
  - meant for pausing currently running thread, but it is not guaranteed.
- sleep(long time)
  - overloaded method sleep(long time, int nanos)
  - Thread will be sent to TIMED_WAITING state
  - after given time, thread enter Ready-to-run state and waits for its execution
  - it is indecent pause
- wait
  - for inter-thread communication
- join
  - join(time)
  - join(time, nanos)
  - used when one thread needs to wait for other thread to complete
  - join() - wait till other threads execution completed
  - join(time) - wait for other thread to complete or till given time
  - it is dependent pause
- interrupt
  - interrupt paused thread
  - it means we can bring out a thread from sleep, join or wait blocked states before its paused time is completed
  - it is request to JVM
    - not allow thread to enter into pause state
    - if already in pause state, take it out from pause state
    - one interrupt call is applied only one time
- synchronized keyword
  - takes lock on current object, jvm won't allow to access object to other threads.
  - we can lock class and object 
  - to lock few lines or to lock parameters use synchronized block
- volatile
  - modifier keyword
  - only for class level variable
  - TODO search more


### inner thread and green thread


## Executor 
- The concurrent API in Java provides a feature known as an executor that initiates and controls the execution of threads. As such, an executor offers an alternative to managing threads using the thread class. At the core of an executor is the Executor interface. It refers to the objects that execute submitted Runnable tasks.

### Interface Executor
- Implementing Sub-Interfaces:
  - ExecutorService
  - ScheduledExecutorService
