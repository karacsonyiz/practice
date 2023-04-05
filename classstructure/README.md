Hozz létre egy Client osztályt, melynek három attribútuma van: név (name), születési idő (dateOfBirth) és cím (address). Típusaik rendre String, LocalDate és String.

Legyen egy konstruktora, mely mindhárom értéket megkapja és beállítja. Mind a három attribútumra legyen lekérdező metódus. Legyen egy public void migrate(String) metódusa, mely az ügyfél elköltözését implementálja, valójában beállítja a tárolt címet az új, paraméterként átadott címre.

Hozz létre egy main metódust, amelyben kipróbálod az osztály működését. Példányosítani kell egy objektumot a Client osztály alapján (ennek során meg kell hívni a konstruktort).

A konstruktor meghívásához a main metódusban létre kell hoznunk egy LocalDate objektumot, és később ezt átadni paraméterként. Ezt a következőképp tehetjük meg:

LocalDate d = LocalDate.of(2010, 1, 1);

Majd érdemes meghívni a getter metódusait, és a visszaadott értéket kiírni.

Majd meg kell hívni a migrate metódust egy másik címmel, majd újra kiírni a címet, a hozzá tartozó getter metódus meghívásával, és azt látjuk, hogy a cím tényleg megváltozott.
Könyv osztály

Hozz létre egy Book osztályt, melynek három attribútuma van: szerző (author), cím (title) és regisztrációs szám (regNumber), mindhárom típusa String.

A konstruktorával meg lehet adni a szerzőt és címet.

Legyen egy public void register(String regNumber) metódusa, mely a nyilvántartásba vételt implementálja, és ennek paraméterül kell megadni a regisztrációs számot.

Írj ehhez is egy main metódust, amivel kipróbálod a működését!
Véletlenszám generálás

Hozz létre egy RandomPrinter Java osztályt, melynek van egy main metódusa, és írjon ki egy véletlenszámot 0 (kizárva) és 10 (kizárva) között. Használd a Random osztály nextInt metódusát. A nextInt metódus első paramétere azt adja meg, hogy mely számnál kisebb véletlenszámokat generáljon. Ez generálhat nullát is. Azaz a nextInt(5) hívás 0 és 4 között az összes egész számot generálhatja, de 5-öt nem. Ahhoz, hogy pl. 1 és 5 között generáljon véletlen számokat, rá kell venni, hogy 0 és 4 között generáljon, majd adjon hozzá egyet. Azaz nextInt(5) + 1. Futtasd le többször, és ellenőrizd, hogy tényleg csak a megengedett számokat generálja!