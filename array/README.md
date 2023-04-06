Feladat

Az array.ArrayMain osztály main() metódusába dolgozz!

Definiálj egy String tömböt a hét napjaival. Írd ki a második elemét (kedd)! Írd ki a tömb hosszát is!

Definiálj egy öt elem hosszú int tömböt, és tárold le benne (ciklussal) a kettő hatványait. Ciklusban írd ki az értékeit.

Definiálj egy hat elemű boolean tömböt, és felváltva írj bele true vagy false értéket, 0. index esetén legyen false. Ciklusban írd ki az elemeit.
Dinamikus adatszerkezet felépítése

Hozz létre egy array.ArrayHandler osztályt, melynek van egy int[] append(int[] source, int item) metódusa, mely visszaad egy új tömböt, mely eggyel nagyobb, mint az eredeti tömb, és az utolsó eleme az item paraméter értéke.

Használd a System.arraycopy() metódust.

Hívd meg a main() metódusából, és írasd ki az eredményét.
Keresés

Az array.ArrayHandler osztályba implementálj egy boolean contains(int[] source, int itemToFind) metódust, mely visszaadja, hogy a paraméterként megadott érték benne van-e a tömbben.

Az array.ArrayHandler osztályba implementálj egy int find(int[] source, int itemToFind) metódust, mely visszaadja a paraméterként megadott érték indexét, ha benne van a tömbben, és -1-et, ha nincs benne.