
### Ideea 1: Variabile și Tipuri de Date

**Rezumat:**

- **Variabile:** Variabilele sunt folosite pentru a stoca date într-un program. Acestea au un nume, un tip de date și o valoare.
- **Tipuri de Date:** Java are două categorii principale de tipuri de date: tipuri de date primitive și tipuri de date de referință. Tipurile de date primitive stochează direct valori simple, în timp ce tipurile de date de referință stochează referințe către obiecte.

**Concluzii:**

1. **Tipuri de Date Primitive:** Java oferă mai multe tipuri de date primitive, cum ar fi `int`, `double`, `char` și `boolean`. Aceste tipuri stochează valori simple și sunt folosite pentru stocarea și calculul datelor simple.

2. **Tipuri de Date de Referință:** Tipurile de date de referință includ clase, interfețe, tablouri și enumerări. Acestea sunt mai complexe și pot stoca referințe către obiecte, care pot conține mai multe atribute și comportamente.

3. **Declararea Variabilelor:** Variabilele trebuie declarate înainte de a fi utilizate. Pentru a declara o variabilă, specificați tipul său de date și numele. De exemplu, `int scor;` declară o variabilă întreagă numită `scor`.

4. **Inițializarea Variabilelor:** Variabilele pot fi inițializate (primind o valoare inițială) la momentul declarației. De exemplu, `int vârstă = 30;` declară și inițializează o variabilă întreagă numită `vârstă` cu o valoare de 30.

**Exemplu de Cod Java:**

```java
public class ExempluVariabile {
    public static void main(String[] args) {
        // Tipuri de date primitive
        int vârstă = 25;
        double salariu = 55000.50;
        char notă = 'A';
        boolean esteStudent = true;

        // Tip de date de referință
        String nume = "John Doe";
        
        // Afișarea valorilor variabilelor
        System.out.println("Vârstă: " + vârstă);
        System.out.println("Salariu: " + salariu);
        System.out.println("Notă: " + notă);
        System.out.println("Este Student: " + esteStudent);
        System.out.println("Nume: " + nume);
    }
}
```

**Explicație:**

În acest exemplu de cod Java, explorăm tipurile de date primitive și de referință. Declarăm și inițializăm variabile de diferite tipuri de date, inclusiv `int`, `double`, `char`, `boolean` și `String` (un tip de date de referință). Codul demonstrează cum să declarați, să inițializați și să afișați valorile variabilelor cu diferite tipuri de date.

### Ideea 2: Operatori și Expresii

**Rezumat:**

- **Operatori:** Operatorii sunt simboluri folosite pentru a efectua operații asupra variabilelor și valorilor. Operatorii comuni includ operatori aritmetici, operatori de atribuire și operatori de comparație.
- **Expresii:** Expresiile sunt combinații de variabile, valori și operatori care produc un rezultat.

**Concluzii:**

1. **Operatori Aritmetici:** Operatorii aritmetici sunt utilizați pentru calcul matematic. De exemplu, `+` adaugă două valori, iar `-` scade o valoare din alta.

2. **Operator de Atribuire:** Operatorul de atribuire (`=`) este folosit pentru a atribui o valoare unei variabile. De exemplu, `int x = 10;` atribuie valoarea 10 variabilei `x`.

3. **Operatori de Comparație:** Operatorii de comparație compară două valori și returnează un rezultat boolean (`true` sau `false`). De exemplu, `x == y` verifică dacă `x` este

 egal cu `y`.

4. **Expresii:** Expresiile sunt construite folosind operatori și operanzi (variabile sau valori). Ele sunt evaluate pentru a produce un rezultat final. De exemplu, `int rezultat = 5 + 3;` este o expresie care calculează suma dintre 5 și 3.

**Exemplu de Cod Java:**

```java
public class ExempluOperatori {
    public static void main(String[] args) {
        // Operatori aritmetici
        int sumă = 5 + 3;
        double produs = 4.5 * 2;
        
        // Operator de atribuire
        int x = 10;
        x += 5; // Echivalent cu x = x + 5
        
        // Operator de comparație
        boolean esteEgal = (sumă == x);
        
        // Afișarea rezultatelor
        System.out.println("Sumă: " + sumă);
        System.out.println("Produs: " + produs);
        System.out.println("Este Egal: " + esteEgal);
    }
}
```

**Explicație:**

În acest exemplu de cod, explorăm diferiți operatori și expresii. Folosim operatori aritmetici pentru adunare și înmulțire, operatorul de atribuire pentru actualizarea unei variabile și operatorul de comparație pentru a compara două valori. Codul demonstrează cum operatorii sunt utilizați pentru a manipula datele în Java și cum expresiile sunt evaluate pentru a produce rezultate.

### Ideea 3: Referințe

**Rezumat:**

- **Referințe:** Pe lângă tipurile de date primitive, Java dispune și de tipuri de date de referință. Variabilele de referință stochează referințe către obiecte în memorie.
- **Obiecte:** Obiectele sunt instanțe ale claselor și pot fi create folosind cuvântul cheie `new`. Acestea conțin atât date (atribute) cât și metode (funcții).

**Concluzii:**

1. **Variabile de Referință:** Variabilele de referință stochează referințe către obiecte. De exemplu, `MyClass myObject;` declară o variabilă de referință pentru un obiect de clasă `MyClass`.

2. **Crearea Obiectelor:** Obiectele sunt create folosind cuvântul cheie `new`, ca în `MyClass myObject = new MyClass();`. Aceasta alocă memorie pentru obiect și îl inițializează.

3. **Caracteristici ale Obiectelor:** Obiectele au atribute (date) și metode (funcții) asociate. Puteți accesa și manipula atributele unui obiect și puteți invoca metodele acestuia prin intermediul variabilei de referință.

**Exemplu de Cod Java:**

```java
// Definirea unei clase simple numite 'Persoană'
class Persoană {
    String nume;
    
    void prezintă() {
        System.out.println("Salut, numele meu este " + nume);
    }
}

public class ExempluObiect {
    public static void main(String[] args) {
        // Crearea unui obiect de tipul clasei 'Persoană'
        Persoană persoană1 = new Persoană();
        persoană1.nume = "Alice";
        
        // Crearea altui obiect
        Persoană persoană2 = new Persoană();
        persoană2.nume = "Bob";
        
        // Invocarea metodelor pe obiecte
        persoană1.prezintă();
        persoană2.prezintă();
    }
}
```

**Explicație:**

În acest exemplu, definim o clasă numită `Persoană` cu un atribut `nume` și o metodă `prezintă()`. Creăm două obiecte ale clasei `Persoană`, fiecare cu propriul său `nume`. Apoi, invocăm metoda `prezintă()` pe aceste obiecte pentru a se prezenta. Acest lucru demonstrează cum variabilele de referință sunt utilizate pentru a crea și interacționa cu obiectele în Java.

### Concluzii:

În Capitolul 3, "Primitive și Referințe," ați învățat concepte esențiale despre variabile, tipuri de

 date, operatori și referințe în Java. Iată principalele idei de reținut:

1. Java suportă atât tipuri de date primitive (cum ar fi `int`, `double`, `char`, `boolean`), cât și tipuri de date de referință (cum ar fi clasele, interfețele, tablourile) pentru stocarea și manipularea datelor.

2. Variabilele sunt folosite pentru a stoca date, iar tipul lor de date determină tipul de date pe care îl pot stoca.

3. Operatorii sunt simboluri care efectuează operații asupra datelor, iar expresiile combină variabile, valori și operatori pentru a produce rezultate.

4. Variabilele de referință stochează referințe către obiecte, iar obiectele sunt instanțe ale claselor, cu atât de date (atribute) cât și metode (funcții).

5. Înțelegerea acestor concepte fundamentale este crucială pentru scrierea de programe Java eficiente.

Prin înțelegerea acestor concepte și practicarea cu exemple de cod, sunteți pe drumul cel bun către dobândirea de competențe în programarea Java. Continuați să explorați și să vă dezvoltați cunoștințele pentru a aborda aplicații Java mai complexe și provocări.
