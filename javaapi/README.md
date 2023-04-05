Egy címből a host kiolvasása

Írj egy javaapi.UrlParser osztályban egy public String readHost(String url) metódust, mely kiolvassa a paraméterként megadott url-ből a host nevét. Ehhez használd a java.net.URL osztályt, és annak a getHost() metódusát.

Hibakezelés

Nem megfelelő paraméter esetén (pl. abcd) dobjunk egy IllegalArgumentException kivételt az Invalid url: abcd szöveggel.

Abban az esetben, ha a paraméterként kapott url nem megfelelő formátumú, az URL osztály példányosítása hibát dob. Ezt a következő kivételkezelő kódrészlettel kezeljük le:

try {
// URL osztály példányosítása
}
catch (MalformedURLException mfue) {
throw new IllegalArgumentException("Invalid url: " + url);
}

Ez a MalformedURLException kivételt lekezeli, és dob helyette egy IllegalArgumentException kivételt.