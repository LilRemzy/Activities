# Activities - example

V tej nalogi sem naredil aplikacijo Activities - example, ki vsebuje tri aktivnosti: MainActivity, HelloActivity in ThirdActivity. Na glavnem zaslonu lahko povečujem števec in prehajam na drugi dve aktivnosti. Vrednost števca se ob prehodu prenese v drugo in tretjo aktivnost z eksplicitnim namenom (`Intent`). Iz drugega in tretjega zaslona se lahko vrnem tudi s potezno navigacijo.

## Ciljj

- izdelati novo aplikacijo s tremi aktivnostmi: `MainActivity`, `HelloActivity` in `ThirdActivity`,
- na glavnem zaslonu (`MainActivity`) pripraviti gumb **Count**, prikaz števca in dva gumba za prehod v drugo in tretjo aktivnost,
- v `HelloActivity` prikazati besedilo **Hello!**, trenutno vrednost števca in gumb za prehod na prvo aktivnost,
- v `ThirdActivity` prikazati napis **Activity 3**, trenutno vrednost števca ter gumba za prehod na prvo in drugo aktivnost,
- vrednost števca prenesti z eksplicitnim namenom: `new Intent(MainActivity.this, HelloActivity.class)`, `putExtra()` v pošiljajoči in `getIntExtra()` v sprejemni aktivnosti,
- vrnitev na `MainActivity` izvesti z zastavicama `Intent.FLAG_ACTIVITY_CLEAR_TOP` in `Intent.FLAG_ACTIVITY_SINGLE_TOP`, da se ne ustvarjajo novi primerki iste aktivnosti in števec ostane ohranjen,
- omogočiti potezno navigacijo z razredom `OnSwipeTouchListener`: poteg v levo sproži prehod na prvo aktivnost, poteg v desno pa prehod na drugo aktivnost,
- v `AndroidManifest.xml` zapisati vse tri aktivnosti (pri ustvarjanju prek Android Studia se doda samodejno),
- preizkusiti delovanje aplikacije pri različnih vrednostih števca.

## Zaslonske slike aplikacije
<img width="270" height="555" alt="Slika1" src="https://github.com/user-attachments/assets/1bbb3540-3155-4e0f-93d7-3a91ed71b111" />
<img width="270" height="555" alt="Slika2" src="https://github.com/user-attachments/assets/69e7eb4d-c578-490b-9400-95ec01b8ddc9" />
<img width="270" height="555" alt="Slika3" src="https://github.com/user-attachments/assets/b298af2b-b137-4b8f-9f0a-f10d9a62ddf0" />
