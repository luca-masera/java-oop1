Creare la classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva
  Alla creazione di un nuovo prodotto il codice deve essere valorizzato con un numero random di massimo 8 cifre.
  Il prodotto espone sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva.
  Il prodotto espone anche un metodo per avere il nome esteso, ottenuto concatenando codice-nome: se il codice è inferiore a 8 cifre fa inserito un pad left di 0.
  Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto: create almeno due prodotti con valori diversi ed invocate i metodi verificando la correttezza dei risultati.