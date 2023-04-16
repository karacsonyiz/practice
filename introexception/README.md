Rendelő

Hozz létre egy Patient osztályt, a szükséges attribútumokkal:

    name, a beteg neve
    socialSecurityNumber, a beteg TAJ száma (String-ként tárolva, hiszen 0-val is kezdődhet!)
    yearOfBirth, a beteg születési éve

Ellenőrizd a születési évet és csak akkor fogadd el, ha legalább 1900.

Ellenőrizd a TAJ számot is a következő algoritmussal: A TAJ szám egy kilenc számjegyből álló szám. A TAJ szám első nyolc számjegyéből a páratlan helyen állókat hárommal, a páros helyen állókat héttel szorozzuk, és a szorzatokat összeadjuk. Az összeget tízzel elosztva a maradékot tekintjük a kilencedik, azaz ellenőrző kódnak. Ha az ellenőrző kód nem egyezik, akkor ne fogadd el a TAJ számot.

IllegalArgumentException dobásával jelezd a nem megfelelő értékeket.