Projektfeladat

Elektronikus osztálynaplót (Enapló) kell megvalósítani. Az alkalmazásban a ClassRecords osztály magát a naplót reprezentálja, ahol felvehetők a diákok (Student). A Student osztályban "tároljuk" a diákok jegyeit Mark. A főbb funkciók a következők: A diákok osztályozhatók, (jegyeket kapnak), a jegyeik alapján általános és tantárgyak szerinti átlag számítható, két tizedesjegy pontossággal. A jegyeik ki is listázhatók a tesztesetekben megadott formában.

Hibakezelés

Törekedjünk az átfogó hibakezelésre! A teszteseteknél látható módon NullPointerException-t várunk, ha a megfelelő metódust null értékkel hívták meg, ha a String paraméter isEmpty() (lásd a tippeknél) akkor a megfelelő szöveggel IllegalArgumentException-t várunk. Az osztály szintű átlagszámítások során ArithmeticException-t várunk a megfelelő szöveggel, ha valamiért nem lehet a számítást elvégezni (nincs jegy, nincs diák felvéve az osztályba, stb.).
Megvalósítási javaslatok

Subject osztály: Egy attribútuma van, a tantárgy nevének tárolására. Ennek alapján azonosítható a tantárgy.

Tutor osztály: Két attribútuma van, a tanár neve és a tanított tantárgyak listája, mindkettő konstruktorból tölthető fel.

publikus metódusok:

public boolean tutorTeachingSubject(Subject subject)

MarkType enum: A(5, "excellent"), B(4, "very good"), C(3, "improvement needed"), D(2, "close fail"), F(1, "fail") értékeket vehet fel, a klasszikus osztályzatot reprezentálja.

Mark osztály: A diák számára adott jegyeket reprezentálja, az osztályzat "értékét" az attribútumai között egy MarkType enum adja. További attribútumai a következők: Subject a tantárgy, amiből kapta a jegyet, Tutor a tanár, aki adja a jegyet. A jegy attribútumai nem állíthatók, ezért csak getter metódusai vannak. Több konstruktorral is létrehozható az objektum.

publikus konstruktorok:

public Mark(MarkType markType, Subject subject, Tutor tutor)
public Mark(String markType, Subject subject, Tutor tutor)

publikus metódusok:

public String toString()

StudyResultByName osztály: Speciális osztály, funkciója a diák és tantárgyi átlagának listázásához adatszerkezetet biztosítani. Attribútumai a diák neve és az össztantárgyi átlaga, konstruktorból feltöltve (csak getter metódusok!).

Student osztály: A diák adatait - jelen esetben csak a nevét (konstruktorból feltöltve, csak getter metódus) - és a jegyeit tárolja, metódusai ezeken dolgoznak. A diák azonosítása a nevén keresztül történik. A toString() metódus a teszteseteknél látható módon a diák nevét és a jegyeit listázza ki szöveges formában.

publikus metódusok:

public void grading(Mark mark)
public double calculateAverage()
public double calculateSubjectAverage(Subject subject)
public String toString()

ClassRecords osztály, a régi papíralapú napló egyes funkcióit reprezentálja. Attribútuma az osztály neve, egy Random objektum (konstruktorból beállítva), valamint a diákok listája. Diákot adhatunk hozzá és el is távolíthatjuk, előbbi esetben már létező nevű diákot nem adhatunk hozzá, és eltávolítani csak olyat lehet, aki már ott van a listában (ismét név alapján). Osztályátlagot tud számolni általánosan és tantárgy alapján, véletlenszerűen ki tud választani egy diákot felelésre, meg tud keresni egy diákot név alapján, és ki tudja listázni a diákok neveit és átlagát a StudyResultByName osztály objektumainak listájaként.

publikus metódusok:

public boolean addStudent(Student student) // felvesz egy diákot az osztályba
public boolean removeStudent(Student student) //kivesz egy diákot az osztályból
public double calculateClassAverage() //osztályátlagot számol, minden diákot figyelembe véve
public double calculateClassAverageBySubject(Subject subject) //tantárgy szerinti osztályátlagot számol,
// kihagyja azon diákokat, akiknek az adott tantárgyból nincs jegye
public Student findStudentByName(String name) // név szerint megkeres egy diákot az osztályban
public Student repetition() //felelethez a listából random módon kiválaszt egy diákot
public List<StudyResultByName> listStudyResults() //a diákok nevét és tanulmányi átlagát egy-egy új objektumba viszi,
// és azok listáját adja vissza
public String listStudentNames() //kilistázza a diákok neveit, vesszővel elválasztva

Tippek

A listák mindig privát attribútumok, nem lehet kiadni ezeket getterrel, csak műveleteket végzünk rajtuk! A Random objektumot a ClassRecords osztály konstruktorban vegye át, a tesztelhetőség miatt. A String paraméterek nem lehetnek üresek, vagy null értékűek. Ezt a vizsgálatot célszerűen egy külön, privát metódus végezze, amit minden olyan osztályban létre kell hozni, ahol használatra kerül:

private boolean isEmpty(String str)