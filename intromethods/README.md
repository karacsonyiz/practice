Feladat

Készíts egy intromethods.TodoList osztályt, mely egy tennivaló listát kezel.

Legyen egy intromethods.Todo osztály melyben legyen egy String caption, és egy boolean finished attribútum (konstruktorban csak caption, mindkettő attribútumhoz getterrel). Legyen egy finish() metódusa, mely a finished attribútum értékét true értékre állítja.

A TodoList osztály egy List<Todo> todos attribútumként tárolja a tennivalókat.

A TodoList osztálynak legyenek a következő metódusai:

    void addTodo(String caption) - felvesz egy új tennivalót a listába (Todo objektum példányosításával)
    void finishTodos(String caption) - az összes olyan tennivalót befejez, melynek a neve megegyezik a paraméterként átadott névvel
    void finishAllTodos(List<String> todosToFinish) - egyszerre több tennivalót lehet befejezni
    List<String> todosToFinish() - visszaadja a befejezendő tennivalók neveit
    int numberOfFinishedTodos() - visszaadja a befejezett tennivalók számát

Teszteld a intromethods.TodoListMain main() metódusából.
Feladat - toString() metódus

Készíts toString() metódust a Todo osztályban, mely visszaadja a tennivaló nevét, és zárójelben megjeleníti, hogy be van-e fejezve.

Készíts toString() metódust a TodoList osztályban, mely visszaadja a tennivalókat szövegesen. Delegáld a hívást az ArrayList toString() metódusának.