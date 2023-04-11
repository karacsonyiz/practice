Book osztály

Hozz létre egy attributes.book.Book osztályt, és legyen egy String title attribútuma. Hozz létre egy konstruktort, mely egy paraméteres és értéket ad a title attribútumnak. Hozz létre egy setTitle metódust, mely értéket ad a title attribútumnak. Hozz létre egy getTitle metódust, mely lekéri az értékét.

Teszteld a BookMain main() metódusában.
Person és Address osztály

Hozz létre egy attributes.person.Person osztályt, String name, String identificationCard attribútumokkal. Az osztályban hozz létre egy String personToString() metódust, mely szövegként adja vissza a Person adatait.

Hozz létre egy Address osztályt, String country, String city, String streetAndNumber, String zipCode attribútumokkal. Az osztályban hozz létre egy String addressToString() metódust, mely szövegként adja vissza az Address adatait.

Az attribútumok konstruktorban is megadhatóak legyenek, és legyenek getter metódusok. Legyen egy correctData metódus mindkét osztályban, mellyel át lehet írni az összes paraméter értékét.

A Person osztály tartalmazzon egy hivatkozást az Address osztályra. (Azaz legyen a Person osztálynak egy Address típusú attribútuma. Legyen egy moveTo(Address) metódus mely beállítja a címet, és egy getAddress, mellyel lekérdezhetővé válik.

Teszteld az osztályokat a PersonMain main() metódusában.
Bill és Item osztály

Legyen egy attributes.bill.Item osztály, melynek legyen String product, int quantity és egy double price attribútuma. Legyen konstruktor, valamint legyenek getter metódusok.

Legyen egy Bill osztály, melynek legyen egy List<Item> items attribútuma. Legyen egy addItem(Item) metódus, és egy getter az items attribútumhoz.

A Bill osztályban legyen egy calculateTotalPrice metódusa, mely végigmegy a számla tételein, beszorozza a quantity és price értékeket, és összeadja őket.

Teszteld a BillMain main metódusával.