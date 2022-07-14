# 7OOPR2_MY-Codes

EXMAPLES:
----------

III : SIMPLE
------------
      a) Vytvořte metodu pro sčítání dvou celých čísel. Vytvořte test, který projde korektně.
      b) Vytvořte funkci, který počítá pythagorovu větu. Vytvořte test, který ji zkontroluje.
      c) Vytvořte funkci, která spočítá počet kladných čísel v poli. Opět vytvořte test, který ji zkontroluje.
      
III : EXTENDED
------------
      a) Vytvořte funkci "signum" ( https://cs.wikipedia.org/wiki/Funkce_signum ). Vytvořte test, který zkontroluje její chování pro všechny 3 varianty.
      b) Vytvořte funkci, která spočítá průměr pole a následně z daného pole spočítá odchylku jednotlivých položek od průměru. Vytvořte test, který ověří obě funkcionality.
      c) Vytvořte funkci realizující výpočet Fibonacciho posloupnosti pro "n" prvků. Vytvořte test, který metodu otestuje.
      d) Vytvořte funkci, která počítá řešení kvadratické rovnice. Vytvořte test, který metodu otestuje - nezapomeňte na všechny možné případy vstupů/výstupů.

IV : SIMPLE
------------
      a) Vytvořte třídu Person tak, že věk osoby je volitelný údaj a nemusí být zadán.
      b) Vytvořte funkci, která rozdělí zadané telefonní číslo na trojice. Otestujte pomocí unitového testování.
      c) Vytvořte funkci, která otestuje, zda je v zadaném řetězci udaný znak. Otestujte pomocí unitového testování.  

V : SIMPLE
------------
      a) Vytvořte instanci třídy reprezentující den-měsíc-rok. Nastavte jej na vaše datum narození a vypište jej na konzoli.
      b) Vytvořte instanci třídy reprezentující den-měsíc-rok nastavené na aktuální datum. Vypište jej na konzoli.
      c) Instanci z předchozího bodu změňte rok na rok 2000. Vypište.
      d) Instanci celou přepracujte na štědrý den roku 1999. Výsledek vypište.
      
V : EXTENDED
------------
      a) Načtěte od uživatele do vhodné instance datum ve formátu den-měsíc-rok.
      b) Načtěte od uživatele do vhodné instance datum ve formátu hodina-minuta.
      c) Vytvořte novou instanci vhodného formátu den-měsíc-rok-hodina-minuta(-sekunda) sloučením hodnot získaných v bodech a), b).
      d) Zjistěte ve letech (desetinné číslo) rozdíl mezi hodnotou v c) a aktuálním dnem. Výsledkem je desetinné číslo (napřiklad 13,748 roku).
      e) Vypište hodnotu z c) ve formátu typu "5. března 2017 14:30", 2017-03-05 14:30", "20170305T1430" a "050320171430".
      
VI A : SIMPLE
------------
      a) Vygenerujte náhodné pole obsahující 100 čísel (i desetinných) v rozsahu -1000 ... 1000. 
      b) Vygenerujte metodu, která sečte všechny kladné hodnoty. Vypište z nich průměr.
      c) Vygenerujte metodu, která sečte všechny záporné hodnoty. Vypište z nich průměr.
      
VI A : EXTENDED
------------
      a) Vygenerujte náhodné pole obsahující 800 celých čísel v rozsahu -1milion .. +1milion.
      b) Vytvořte funkci, která vytvoří dvourozměrné pole. Do prvního rozměru pole se vloží všechny prvky původního pole, které jsou kladné. 
        Do druhého rozměru pole se vloží všechny prvky původního pole, které jsou záporné. Hodnoty 0 vyházejte a nedávejte nikam. 
        Zajistěte samozřejmě, ať žádné z vytvořených polí neobsahuje "nepoužitá" políčka.
      c) Vypište průměr a směrodatnou odchylku původního pole i nově vytvořených pod-polí.
      
VI B : SIMPLE
-------------
      a) Vytvořte třídu Person definující jméno, příjmení a věk uživatele. Realizujte nativní řazení třídy Person podle příjmení, při shodě příjmení podle jména.
      b) Vytvořte list čísel a seřaďte ho sestupně(!)
      
VI B : EXTENDED
---------------
      1) Vytvořte třídu Person definující jméno, příjmení a věk uživatele (stejné jako v Simple verzi úkolu).
      1a) Vytvořte vlastní porovnávač, který bude řadit nejdříve podle příjmení, při shodě podle jména, při shodě podle věku. Dejte si pozor na korektní řazení českých znaků (Čečeška, Žába, Ďuricová, atd.).
          Upravte jej, ať si může programátor zvolit, zda se má řadit vzestupně nebo sestupně.
      1b) Vytvořte vlastní porovnávač, který bude řadit podle věku od nejstarší osoby po nejmladší. Osoby, které věk nemají zadán (je null) budou vždy na konci seznamu.
      U obou funkcionalit demonstrujte chování v metodě main().
      
VII : SIMPLE
-------------
      Vygenerujte hashSet, TreeSet, ArrayList a LinkedList o velkém počtu náhodných čísel (počet vhodně zvolte). U každého generování vypište čas 
      tvorby všech prvků a nakonec vypište průměr všech nagenerovaných hodnot v daném objektu. Zamyslete se nad hodnotou průměru - je to také náhodné číslo? 
      Co pro něj platí?
      
      Vypište prvky ze všech 4 objektů ve vzrůstajícím pořadí.
       
VII : EXTENDED
-------------
      1) Vytvořte třídu Contact, kde každá osoba má jméno a několik e-mailů. Maily u stejné osoby se nesmí opakovat. Ověřte unitovým testem.
      2) Přidejte ke třídě Contact možnost, že každá osoba má až 5 (ale ne více) telefonních čísel. Ověřte unitovým testem.
      3) Vytvořte třídu ContactList, která vede evidenci kontaktů.
      4) Vytvořte v ContactList metodu, která nalezne osobu podle jejího zadaného e-mailu. Vytvořte 2 varianty této metody - první varianta vrátí 
      první nalezenou osobu s emailem (nebo null), druhá metoda vrátí všechny osoby, které používají daný e-mail. Obě varianty ověřte unitovým testem.
      V metodě main() vytvořte list kontaktů, naplňte jej několika osobami a vypište postupně u každé osoby všechny informace v přehledném formátu
      na konzolový výstup (System.out).
      
IX : SIMPLE
------------
      Vypište všechny dokumenty Excel na disku s velikostí větší než 250kB.

IX : EXTENDED
-------------
      Vytvořte metodu, která najde na disku všechny soubory s jednou ze zadaných přípon (může jich tedy být  zadáno více než jedna) 
      a zkopíruje je na dané cílové umístění.

      Realizujte funkci třemi způsoby:
      a) jednoduchým for-each cyklem nad prvky nalezenými ve složce přes "listFiles()" funkci
      b) jednoduchým for-each cyklem nad prvky nalezenými ve složce pres "listFiles(FileNameFilter...)" funkci
      c) implementací pomocí třídy SimpleFileVisitor. ???

      Vypište všechny kořenové složky počítače (tj. disky) a u každé vypište počet všech složek, které na ní jsou.
      
X : SIMPLE
----------
      Vytvořte program, který načte text ze zadaného souboru. Do cílového souboru se namísto slov v původním souboru zapíší
      pouze cifry určující počet písmen daného slova.
      
X : EXTENDED
----------
      Vytvořte program, který načte textový soubor. Program rozpozná jednotlivá slova a počet jejich výskytů. Dvojice (slovo-počet výskytů) 
      seřadí podle počtu výskytů sestupně a postupně dvojice zapíše po řádcích do výstupního souboru.
      
SEMESTRAL HOMEWORKS:
--------------------

1) Knihovna - class diagram + prototyp implementace (HW1):
----------
Vytvořte diagram tříd a prototyp implementace podle následujícího zadání:

 Knihovna má evidenci knih, knihy mají nejméně autora, název, vydavatele a ISBN. Na knihy se dělají výpůjčky, které lze prodlužovat. Výpůjčka vzniká, když si návštěvník knihu vyzvedne a zaniká, když návštěvník knihu vrací. korektně má být výpůjčka vrácena do 31 dnů od vypůjčení. V případě pozdního vrácení vzniká penále, které musí být v systému uloženo pro případné další hodnocení návštěvníka.

Ohledně návštěvníka se eviduje jméno, adresa, telefony, e-mailové kontakty. Systém samozřejmě také umí dohledávat všechny výpůjčky pro daného návštěvníka, všechny výpůjčky dané knihy, všechna penále daného návštěvníka, všechny aktuální výpůjčky a všechny výpůjčky, které jsou po termínu vrácení.

Realizujte v nějakém nástroji diagram tříd (class diagram) dané problematiky. Na základě tohoto diagramu také realizujt jednotlivé třídy, které budou implementovat danou problematiku - POZOR - u funkcí neimplementujte tělo funkce, pouze signaturu (viditelnost, návratovou hodnotu, název a parametry).

Odevzdáváte diagram jako obrázek + samostatné soubory .java jednotlivých tříd (tj. například class diagram v JPG/PNG + 7 .java souborů) zabalené do jednoho souboru ZIP/7Z/TGZ (žádné vložené soubory, ne RAR).

2) Filtrování hráčů - dědičnost (hw2)
-------------------------------
Vytvořte diagram tříd a prototyp implementace podle následujícího zadání - filtrování hráčů podle podmínky.

V přiloženém diagramu vidíte základní schéma. Vytvořte odpovídající třídy. Následně implementujte filtrování s využitím dědičnosti tak, abyste dosáhli univerzálního chování.

Ve třídě FilteringManager implementujte funkci (funkce, je-li jich třeba dle vašeho názoru více) na filtrování vstupního pole hráčů. Do funkce vstupuje pole hráčů (ošetřete vstupní chyby!) a filtr, podle kterého se má filtrovat. Funkce profiltruje hráče a vrátí pouze ty, kteří splňují filtrační podmínku, a to ve formě nového pole (neměníte původn pole).

Řešení vytvořte tak, aby bylo co nejvíce univerzální. Implementujte nejméně 4 druhy filtrů - například "obsahuje ve jméně", ... "je starší než", atp.

Odevzdáváte samostatné soubory .java jednotlivých tříd (tj. například 7 .java souborů) zabalené do jednoho souboru ZIP/7Z/TGZ (žádné vložené soubory, ne RAR).

Soubor odevzdávejte jako číslo úkolu + _ + vaše studentské číslo např: "2_R15088"

3) Výpočet mzdy k vyplacení (hw3)
-------------------------------
Vytvořte program, který vypočítá a vypíše mzdu k vyplacení.

Uživatel do programu zadá výši hrubé mzdy a výši již vyplacené části mzdy (zálohy) a zda je zaměstnanec student.

Program z hrubé mzdy strhne:

4,5% za zdravotní pojištění
není-li student), tak 6,5% sociální pojištění
daň z příjmu: 15% z částky do 30000, 20% z částky nad 30000.
Od výsledné částky odečte již vyplacenou zálohu a vypíše částku k vyplacení (případně informaci o přeplatku v zálohách) a informace o jednotlivých srážkách (zdravotní/sociální pojištění, daň). Výstup zkuste vzhledně formátovat.

Odevzdáváte samostatné soubory .java jednotlivých tříd (tj. například 7 .java souborů) zabalené do jednoho souboru ZIP/7Z/TGZ (žádné vložené soubory, ne RAR).

Soubor odevzdávejte jako číslo úkolu + _ + vaše studentské číslo např: "2_R15088"

4) Unitový test na "Výpočet mzdy k vyplacení" (hw4)
---------------------------------------------

Vytvořte unitové testy, které testují funkcionalitu z předchozího úkolu 3).

Pokud jste vše v minulém úkolu dali pouze do funkce "main()", nyní to vhodně rozdělte na samostatně volatelné funkce. Napište unitové testy, které otestují vaše funkce. Otestujte všechny smysluplné varianty, které Vás napadnou. Měli byste tedy mít metodu a) na výpočet zdravotního pojištění; b) na výpočet sociálního pojištění; c) na výpočet daně (viz příklad níže).  Netestujte vstupy od uživatele.

Odevzdáváte samostatné soubory .java jednotlivých tříd (tj. například 7 .java souborů) zabalené do jednoho souboru ZIP/7Z/TGZ (žádné vložené soubory, ne RAR). Odevzdávate jak stejné soubory jako minule (včetně případných změn, bylo-li nyní třeba), tak soubory s testy.

Příklad výpočtu:

Hrubá mzda 54321,--. Záloha 20000,--. Zdravotní 2444,45. Sociální - student 0,--, zaměstnanec 3530,87. Daň z příjmu - z částky do 30000,-- je to 4500,--,  z částky přesahující 30000,-- je to 4864,20, celkem daň 9364,20. K výplatě tedy jde studentovi 22512,35, zaměstnanci 18981,48.

Soubor odevzdávejte jako číslo úkolu + _ + vaše studentské číslo např: "2_R15088"

Evidence výsledků závodů (HW5):
-------------------------------
Implementujte následující úkol - evidenci výsledků závodů.

Vytvořte třídu, která bude realizovat správce závodů.
Každý závod je identifikován svým název (jako klíčem), a obsahuje sadu záznamů výsledků. Každý výsledek obsahuje informaci o závodníkovi (tj. jméno)
 a dosaženém času (klidně stačí v sekundách/milisekundách, ale je třeba jej zobrazovat "hezky" jako čas). Výsledky závodu nemusí být seřazeny ihned,
 ale musí být seřazeny, když se vypisují (nižší čas = dřívější výsledek). Zajistěte, aby výsledek závodu nemohl být nikdy null (demonstrujte unit-testem),
  nebo obsahovat prázdná data (prázdné/null jméno závodníka, záporný nebo nulový čas) (- opět demonstrujte unit testem).
  Chybná data vyhazují výjimku "IllegalArgumentException" se smysluplným textem. Null hodnota vyhazuje výjimku NullArgumentException se smysluplným textem.

V metodě "main()" demonstrujte použití a výpis dat. Například:

Monaco 1993

1. Alain Prost        1:20.557
2. Michael Schumacher    1:21.190
3. Ayrton Senna        1:21.552
4. Damon Hill        1:21.825
5. Jean Alesi        1:21.948
6. Riccardo Patrese    1:22.117
7. Gerhard Berger        1:22.394
8. Karl Wendlinger        1:22.477
9. Michael Andretti    1:22.994
10. Érik Comas        1:23.246

Monaco 2019

1. Lewis Hamilton        1:10.166
2. Valtteri Bottas        1:10.252
3. Max Verstappen        1:10.641
4. Sebastian Vettel    1:10.947
5. Pierre Gasly        1:11.041
6. Kevin Magnussen        1:11.109
7. Daniel Ricciardo    1:11.218
8. Daniil Kvyat        1:11.271
9. Carlos Sainz Jr.    1:11.417
10. Alexander Albon        1:11.653

====

6) Generátor tříd Plant-UML (hw6)
---------------------------------
Vytvořte generátor diagramu tříd pro systém PlantUML.

Použití:

Vezměte od uživatele název souboru zadaný jako parametr příkazového řádku - soubor .Java a druhý parametr příkazového řádku - výstupní .txt soubor.

Soubor otevřete, a zpracujte všechny deklarace uvedené uvnitř souboru. Vygenerujte kód, který reprezentuje class diagram obsahu souboru v PlantUML; kód zapište do výstupního souboru. Pokud existuje, přepište jej (= neřešte chyby). Pro vizualizaci UML pro svůj test využijte: https://www.planttext.com/.

Co musí aplikace umět:

ošetření chyb
zobrazení všech tříd a rozhraní v rámci balíčku (tj. rámeček pro balíček!) v diagramu
u tříd/rozhraní se zobrazují všechny atributy a metody, včetně viditelnosti a parametrů
nalezněte a vhodně aplikujte stereotyp <<static>>
zobrazte deklarace členů ve správném formátu "název : typ", tedy ne jako v Javě "typ název".
vše v rozhraní (interface) je automaticky veřejné (public)
odlišujte extends a implements v typu spojnic
Co nemusí aplikace umět (= co aplikace vůbec neočekává na vstupu, nemusíte ani ošetřovat případné chyby):

ignorujte jakékoliv vnitřní třídy/rozhraní
ignorujte enumy, zajímají nás jen deklarace "interface" a "class"
ignorujte jakákoliv klíčová slova kromě static, public, private a primitivních datových typů
u funkcí ignorujte "..." v parameterch, předpokládejte jen klasické parametry.
ignorujte asociace/agregace/kompozce/jakékoliv jiné vztahy mezi třídami vyjma extends/implements
syntaktické chyby (předpokládá se plně kompilovatelný kód)
neřešte umístění diagramů vlevo/nahoře/vpravo/dole
ignorujte existenci generických typů (pokud je znáte) - ala "class X<T>"
Práce se soubory obecně není součástí úkolu a nehodnotí se, (ale zpracování chyb - try/catch kolem načítání/ukládání ANO!).

Odevzdáváte celý projekt Idea zabalený do jednoho souboru ZIP/7Z/TGZ (žádné vložené soubory, ne RAR).

Rady:

Uvědomte si, že v souboru .java vás zajímá jen informace o package a kód třídy
Ve třídě stačí odlišovat deklarace oddělení středníky a složenými závorkami
Uvědomte si, že třída může implementovat několik rozhraní
Pomocný kód pro práci se soubory:

// načtení
String fileName = "název souboru";
List<String> lines = java.nio.file.Files.readAllLines(Path.of(fileName));

// uložení
String fileName = "název souboru";

List<String> lines = new ArrayList<>();
java.nio.file.Files.write(Path.of(fileName), lines);

String oneBigString = "some...long...text";
java.nio.file.Files.writeString(Path.of(fileName), oneBigString);
Příklad:

test.java - vstup
test.puml - textový výstup
test.png - vizualizace
POZOR prosím je tam chyba, funkce "format()" u "Formattable" má být public!
Soubor odevzdávejte jako číslo úkolu + _ + vaše studentské číslo např: "2_R15088"

6) Zálohovací systém (hw7)
--------------------------
Implementujte zálohovací systém.

Aplikace na vstupu vezme název vstupní složky IN a název výstupní složky OUT (od uživatele z konzole, nebo jako parametry příkazové řádky).

Aplikace zazálohuje obsah (tj. soubory i podsložky) z IN do OUT (zůstává stejná stromová struktura). Soubor se zálohuje, pokud je zdrojový soubor odlišný od cílového, nebo cílový soubor neexistuje. Pokud cílový soubor existuje, přidá se k němu přípona (například datum, kdy byl odložen). Tj. pokud zálohuju "a.txt" do cílového "a.txt", který již existuje, tak existující "a.txt" přejmenuji na "a_1.txt" nebo "a_2021_04_21.txt" či jakkoliv podobně, a poté provedu zálohu. Pozor, nesmíte změnit příponu souboru.

Řešení doplňte vhodnými průběžnými výstupy pro uživatele, aby věděl, co se děje, a samozřejmě ošetřete správným způsobem proti rozličným chybám.

Odevzdává se celé řešení IDEA v ZIP/7Z.

Odevzdává se celé řešení jako ZIP.



