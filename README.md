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
      
