# Accesso concorrente a variabili condivise
## Esempio accesso concorrente a  variabile 'stack'

[Esempio accesso concorrente a  variabile 'stack'](https://iisponti.gitbook.io/tecnologie_quinta_2023_24/accesso-concorrente-a-variabili-condivise#esempio-accesso-concorrente-a-variabile-stack)

Esempio di alcune esecuzioni:

```
PS C:\SCUOLA\RUN> javac .\StackConcorrenteApp.java
PS C:\SCUOLA\RUN>
PS C:\SCUOLA\RUN>
PS C:\SCUOLA\RUN> java StackConcorrenteApp
PUT >>>> f
GET <<<< 1, value: e
PUT >>>> g
GET <<<< 2, value: f
PUT >>>> h
GET <<<< 3, value: h
PUT >>>> i
GET <<<< 4, value: h
PUT >>>> j
PUT >>>> k
GET <<<< 5, value: j
PUT >>>> l
GET <<<< 6, value: k
GET <<<< 7, value: l
PUT >>>> m
PUT >>>> n
GET <<<< 8, value: k
PUT >>>> o
GET <<<< 9, value: n
GET <<<< 10, value: o
PUT >>>> p
GET <<<< 11, value: o
PUT >>>> q
PUT >>>> r
GET <<<< 12, value: q
PUT >>>> s
GET <<<< 13, value: q
PUT >>>> t
GET <<<< 14, value: s
PUT >>>> u
GET <<<< 15, value: u
PUT >>>> v
GET <<<< 16, value: v
PUT >>>> w
GET <<<< 17, value: w
PUT >>>> x
GET <<<< 18, value: w
PUT >>>> y
GET <<<< 19, value: x
PUT >>>> z
GET <<<< 20, value: y
PUT >>>> A
GET <<<< 21, value: z
PUT >>>> B
GET <<<< 22, value:  
GET <<<< 23, value: A
PUT >>>> C
PUT >>>> D
GET <<<< 24, value: C
PUT >>>> E
GET <<<< 25, value: A
PUT >>>> F
GET <<<< 26, value: F
PUT >>>> G
GET <<<< 27, value: G
PUT >>>> H
GET <<<< 28, value: G
PUT >>>> I
GET <<<< 29, value: I
PUT >>>> J
GET <<<< 30, value: J
PUT >>>> K
GET <<<< 31, value: K
PUT >>>> L
GET <<<< 32, value: L
PUT >>>> M
GET <<<< 33, value: M
PUT >>>> N
GET <<<< 34, value: N
PUT >>>> O
GET <<<< 35, value: O
PUT >>>> P
GET <<<< 36, value: P
PUT >>>> Q
PUT >>>> R
GET <<<< 37, value: Q
GET <<<< 38, value: P
PUT >>>> S
PUT >>>> T
GET <<<< 39, value: R
PUT >>>> U
GET <<<< 40, value: T
GET <<<< 41, value: U
PUT >>>> V
PUT >>>> W
GET <<<< 42, value: V
PUT >>>> X
GET <<<< 43, value: U
GET <<<< 44, value: X
PUT >>>> Y
GET <<<< 45, value: X
PUT >>>> Z
GET <<<< 46, value: Y
GET <<<< 47, value: A
GET <<<< 48, value: A
GET <<<< 49, value: r
GET <<<< 50, value: d
GET <<<< 51, value: c
GET <<<< 52, value: b
FINITO is EMPTY: NO
```

mentre un'altra:

```
PUT >>>> f
GET <<<< 1, value: e
PUT >>>> g
GET <<<< 2, value: g
PUT >>>> h
GET <<<< 3, value: g
PUT >>>> i
PUT >>>> j
GET <<<< 4, value: i
PUT >>>> k
GET <<<< 5, value: j
PUT >>>> l
GET <<<< 6, value: j
GET <<<< 7, value: k
PUT >>>> m
GET <<<< 8, value: m
PUT >>>> n
GET <<<< 9, value: n
PUT >>>> o
PUT >>>> p
GET <<<< 10, value: o
GET <<<< 11, value: p
PUT >>>> q
GET <<<< 12, value: q
PUT >>>> r
GET <<<< 13, value: q
PUT >>>> s
GET <<<< 14, value: r
PUT >>>> t
GET <<<< 15, value: t
PUT >>>> u
GET <<<< 16, value: t
PUT >>>> v
GET <<<< 17, value: u
PUT >>>> w
GET <<<< 18, value: v
PUT >>>> x
GET <<<< 19, value: w
PUT >>>> y
GET <<<< 20, value: x
PUT >>>> z
GET <<<< 21, value: y
PUT >>>> A
GET <<<< 22, value: z
PUT >>>> B
GET <<<< 23, value: A
PUT >>>> C
GET <<<< 24, value: B
PUT >>>> D
GET <<<< 25, value: C
PUT >>>> E
GET <<<< 26, value: E
PUT >>>> F
GET <<<< 27, value: F
PUT >>>> G
GET <<<< 28, value: G
PUT >>>> H
GET <<<< 29, value: H
PUT >>>> I
GET <<<< 30, value: I
PUT >>>> J
PUT >>>> K
GET <<<< 31, value: J
PUT >>>> L
GET <<<< 32, value: K
PUT >>>> M
GET <<<< 33, value: K
PUT >>>> N
GET <<<< 34, value: M
PUT >>>> O
GET <<<< 35, value: N
PUT >>>> P
GET <<<< 36, value: O
GET <<<< 37, value: L
PUT >>>> Q
PUT >>>> R
GET <<<< 38, value: Q
PUT >>>> S
GET <<<< 39, value: R
GET <<<< 40, value: S
PUT >>>> T
PUT >>>> U
GET <<<< 41, value: S
PUT >>>> V
GET <<<< 42, value: U
PUT >>>> W
GET <<<< 43, value: W
PUT >>>> X
GET <<<< 44, value: W
PUT >>>> Y
GET <<<< 45, value: Y
PUT >>>> Z
GET <<<< 46, value: Z
GET <<<< 47, value: Z
GET <<<< 48, value: T
GET <<<< 49, value: d
GET <<<< 50, value: c
GET <<<< 51, value: b
GET <<<< 52, value: a
FINITO is EMPTY: YES

```

Dall'output si capisce che la struttura dati a cousa dell'accesso concorrente in ambedue la esecuzioni 
non è in uno stato consistente. Dall'output della prima esecuzione la struttura Stack non risulta vuota 
come ci si aspetterebbe al tremine dell'esempio. 




