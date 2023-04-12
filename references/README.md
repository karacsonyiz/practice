Feladat - közösségi hálózat

Javaslat, hogy a feladat megoldása előtt próbáld meg lerajzolni az objektumokat, és a közöttük lévő referenciákat.

Implementálj egy közösségi hálózatot, ami tagokból áll, és mindegyik tag ismerősnek jelölhet egy másik tagot. Ki kell keresni azon kapcsolatokat, ahol a tagok egymást jelölték be.

Egy tagot reprezentáljon a references.Member osztály. Legyen egy String name attribútuma konstruktorból feltöltve, getterrel. Legyen egy List<Member> connections attribútuma, mely a bejelölt tagokat tartalmazza. Ennek is legyen gettere.

Figyeld meg, hogy egy osztály egy saját típusú attribútumot is tartalmaz!

Legyen egy void connectMember(Member member) metódusa, mely a listába beteszi a paraméterként átadott elemet.

Hozz létre egy references.SocialNetwork osztályt, mely List<Member> members attribútuma az összes tagot tartalmazza.

A void addMember(String name) metódusa példányosítson a paraméterként megadott névvel egy Member osztályt és adja hozzá a listához.

Legyen egy void connect(String name, String anotherName) metódusa, mely kikeresi az első tagot név szerint, majd kikeresi a második tagot név szerint és az első connectMember metódusát kell meghívni a második taggal, mint paraméterrel.

A kikereséshez implementálj egy Member findByName(String name) metódust a SocialNetwork osztályba, ami kikeresi a members listából a tagot név szerint.

A List<String> bidirectionalConnections() metódusa keresse ki azokat a tagokat, melyek egymást bejelölték. Egy ciklusban végig kell menni a members listán, majd azon belül egy másik ciklusban a kapcsolatain (getConnections()). Amennyiben a második tag is bejelölte az első tagot (azaz az második tag benne van a kapcsolatai listájában - használd az ArrayList.contains() metódust) -, a kettő tag nevét fűzd össze egy Stringbe, és tedd egy List<String> típusú változóba.

A következő kódot kell majd megírni a references.SocialNetworkMain main() függvényben:

SocialNetwork socialNetwork = new SocialNetwork();
socialNetwork.addMember("Joe");
socialNetwork.addMember("John");
socialNetwork.addMember("Jane");
socialNetwork.addMember("Richard");

socialNetwork.connect("Joe", "John");
socialNetwork.connect("John", "Joe");

System.out.println(socialNetwork.bidirectionalConnections());

Az utolsó sornak a következőt kell kiírnia:

[Joe - John, John - Joe]

Feladat - toString

Implementáld a SocialNetwork toString metódusát a members változó toString() metódusának hívásával.

Implementáld a Member toString metódusát, hogy írja ki a tag nevét, és azon tagok nevét, akiket bejelölt. Segítségként implementáld a Member osztályban a List<String> connectedNames() metódust, mely egy listaként visszaadja a bejelölt tagok nevét.