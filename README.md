# Mini Neptun


### Funkcionális követelmények

- Tanulóként: 	- tárgyak listázása, felvétele, leadása
				- kurzusok listázása, leadása
				- kurzusokra jelentkezés
				- kurzus adatainak megtekintése
				- tárgyat felvett hallgatók listázása
- Oktatóként: 	- tárgyak hozzáadása, módosítása, törlése, listázása
				- kurzusok hozzáadása, módosítása, törlése, listázása
				- kurzus limit beállítása
				- tanulók felvétele, törlése a kurzusokról
				- jegybeírás
- A tanulók és oktatók bejelentkezés után használhatják a funkciókat.
- A főoldalon választani lehet, hogy tanulóként vagy oktatóként szeretne belépni.

### Nem funkcionális követelémenyek:

- felhasználóbarát, ergonomikus elrendezés és kinézet
- gyors működés
- biztonságos működés: jelszavak tárolása, funkciókhoz való hozzáférés

### Szakterületi fogalomjegyzék:

- tárgy: kurzusokból áll, egy tárgyból csak egy kurzust lehet felvenni egyszerre
- kurzus: egy oktató és bizonyos mennyiségű hallgató a tagja
- kurzus limit: oktató álltal beállított mennyiségű tanulók jelentkezhetnek fel egy adott kurzusra
- jegybeírás: a tanuló teljesítményének osztályozása számonkérés esetén

### Szerepkörök:
- Tanuló: Az összes tárgyat és kurzust megtekintheti, de nem módósíthatja azokat. Illetve jelemtkezhet kurzusokra.
- Oktató: A megtekintésen túl létrehozhat tárgyakat és kuzusokat, és törölheti azokat. Illetve felvehet vagy törölhet tanulókat kurzusokról. 

### Fejlesztői környezet beállítása

1. [Projekt](https://github.com/Vivka02/MiniNeptun) letöltése GitHubról
2. [IntelliJ IDEA](https://www.jetbrains.com/idea/) letöltése
3. Projekt megnyitása
4. A program ezt fogja kiírni: *Project SDK is not defined* -> Setup SDK és ki kell választani a megfelelő Java verziót (Java 11) vagy ha nincs letöltve, akkor letölteni
5. A menüben Run -> Run... -> MiniNeptunApplication


#### Adatbázis kezelő beállítása

1. Tetszőleges böngésző megnyitása
2. Url: **localhost:8080/h2**
3. Megjelenik az oldalon a bejelentkező felület
4. A JDBC Url-t módósítani kell a következőre: **jdbc:h2:file:C:/data/sample**
	
#### Felhasznált technológiák

- [Git](https://git-scm.com/) verziókezelő
- [GitHub](https://github.com/) a projekt közzétételéhez
- [Spring boot](https://spring.io/projects/spring-boot) keretrendszer
- [H2](https://www.h2database.com/html/main.html) adatbáziskezelő
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) integrált fejlesztői környezet

### Kapcsolati UML


