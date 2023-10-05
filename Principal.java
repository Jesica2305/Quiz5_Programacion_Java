public class Principal {
    public  static void min (String[] args) {
   /*
    Creamos el objeto bibliotecaKonradLorenz que usa las caracteristicas de biblioteca
    el método tiene complejidad temporal O(1)
    */
        Biblioteca bibliotecaKonradLorenz = new Biblioteca();
        /*
        Creamos los 5 objetos de la clase Libro
         */
        Libro Libro1 = new Libro ("Cien años de soledad","Gabriel García Márquez",496);
        Libro Libro2 = new  Libro ("El código Da Vinci", "Dan Brown", 656);
        Libro Libro3 = new  Libro ("1984", "George Orwell ", 326);
        Libro Libro4 = new  Libro ("El Hobbit", "J.R.R.Tolkien ", 310);
        Libro Libro5 = new  Libro ("La Odisea", "Homero ", 448);
    }
}
