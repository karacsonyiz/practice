Feladat - hét napjai

Vegyél fel egy enumtype.week.DayType enumot, melynek két értéke a WORKDAY, HOLIDAY. Vegyél fel egy Day enumot, mely a hét napjait tartalmazza, és a szombat és vasárnap legyen megjelölve szünnapnak. A WorkdayCalculator osztályban legyen egy List<DayType> dayTypes(Day firstDay, int numberOfDays) metódus, melynek meg kell mondani az első napot, majd az utána következő napok számát, és visszaad egy listát, mely azt tartalmazza, hogy a i. nap milyen típusú.

Használj egy private Day nextDay(Day day) segédmetódust, mely megmondja a paraméterként megadott nap után következő napot. Vasárnap után hétfő következik.

Teszteld a WorkdayCalculatorMain main metódusában.
Feladat - mértékegységek

Legyen egy enumtype.unit.LengthUnit enum, mely tartalmazza a milliméter, centiméter, méter, yard, foot és inch mértékegységeket. Mindegyik tartalmazza, hogy si mértékegység-e, valamint hogy egy egység mennyi milliméterre átváltva.

Írj a UnitConverter osztályban egy BigDecimal convert(BigDecimal length, LengthUnit source, LengthUnit target) metódust, mely átváltja a paraméterként megkapott értéket, melynek meg van adva a mértékegysége a cél mértékegységre. Először váltsd át milliméterre, majd vissza a cél mértékegységre. Négy tizedesjegyre kell kerekíteni.

A List<LengthUnit> siUnits() metódus adja vissza az SI mértékegységeket.

A UnitConverterMain main() metódusban próbáld ki a convert() metódust, majd írd ki az összes mértékegységet, valamint csak az SI mértékegységeket.