package Day48_Collection;

public class Process {
    //Process - is instance of a program that is running on computer.
    //Різні вкладки однієї програми це нові інстанси.

    //Thread - is subset of the process, a sequence of activities within a process. (they share resources)
    //Це шось схоже на вкладки в хромі: *різні вкладки самої програми хрому - це процеси
    //                                  *різні вкладки сторінок всередині хром програми - це threads



    //Multi-tasking - more than one process(of same program) running in operating system.
    // Threads being executed concurrently -->   1000 > 1000 > 1000 > 1000 > 1000 = 50seconds  //single process manages it
    // Threads being executed parallelly   -->   1000 | 1000 | 1000 | 1000 | 1000 = 10seconds  //multiple processes manage it



    //Multi-threading - is when two or more threads are running within a process.
    //Synchronized (Thread-safety) - one thread at a time in multi-thread enviroment.

    //Якшо ти не хочеш шоб всі среди одночасно юзали ресурси процесу, то робиш Thread-Safety
    //типу інші среди чекають допоки перший сред не завершить використання ресурсу.

}
