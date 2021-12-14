
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;
    private int vecesPrestado;
    private boolean esLibroDeTexto;
    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginas, boolean libroTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginas;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = libroTexto;
    }
    public boolean getEsLibroDeTexto() {
        return esLibroDeTexto;
    }
    public int getVecesPrestado() {
        return vecesPrestado;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public String getDetalles() {
        String detalles;
        String infoLibro = "";
        if (esLibroDeTexto == true) {
            infoLibro = "si";
            if (numeroReferencia != "") {
                detalles = "Titulo: " + titulo + "," + " Autor: " + autor + "," + " Paginas: " + numeroPaginas + "," + " Numero de referencia: " + numeroReferencia + " Prestado: " + vecesPrestado + " Libro de texto: " + infoLibro;
            
            }
            else {
                detalles = "Titulo: " + titulo + "," + " Autor: " + autor + "," + " Paginas: " + numeroPaginas + "," + " Numero de referencia: " + "ZZZ" + " Prestado: " + vecesPrestado + " Libro de texto: " + infoLibro;
            }
        }
        else {
            infoLibro = "no";
            if (numeroReferencia != "") {
                detalles = "Titulo: " + titulo + "," + " Autor: " + autor + "," + " Paginas: " + numeroPaginas + "," + " Numero de referencia: " + numeroReferencia + " Prestado: " + vecesPrestado + " Libro de texto: " + infoLibro;
            
            }
            else {
                detalles = "Titulo: " + titulo + "," + " Autor: " + autor + "," + " Paginas: " + numeroPaginas + "," + " Numero de referencia: " + "ZZZ" + " Prestado: " + vecesPrestado + " Libro de texto: " + infoLibro;
            }      
        }
        return detalles;
    }
    public String getNumeroReferencia() {
        return numeroReferencia;
    }
    public void setNumeroReferencia(String numero) {
        if (numero.length() >= 3) {
            numeroReferencia = numero;
        }
        else {
            System.out.println("ERROR, introduzca más de 3 caracteres");
        }
    }
    public void imprimeAutor() {
        System.out.println("El autor del libro es: " + autor);
    }
    public void imprimeTitulo() {
        System.out.println("El titulo del libro es: " + titulo);
    }
    public void imprimeDetalles() {
        String infoLibroMostrar = "";
        if (esLibroDeTexto == true) {
            infoLibroMostrar = "si";
            if (numeroReferencia != "") {
                System.out.println("Titulo: " + titulo + "," + " Autor: " + autor + "," + " Paginas: " + numeroPaginas + "," + " Numero de referencia: " + numeroReferencia + " Prestado: " + vecesPrestado + " Libro de texto: " + infoLibroMostrar);
            
            }
            else {
                System.out.println("Titulo: " + titulo + "," + " Autor: " + autor + "," + " Paginas: " + numeroPaginas + "," + " Numero de referencia: " + "ZZZ" + " Prestado: " + vecesPrestado + " Libro de texto: " + infoLibroMostrar);
            }
            }
        else {
            infoLibroMostrar = "no";
            if (numeroReferencia != "") {
                System.out.println("Titulo: " + titulo + "," + " Autor: " + autor + "," + " Paginas: " + numeroPaginas + "," + " Numero de referencia: " + numeroReferencia + " Prestado: " + vecesPrestado + " Libro de texto: " + infoLibroMostrar);
            
            }
            else {
                System.out.println("Titulo: " + titulo + "," + " Autor: " + autor + "," + " Paginas: " + numeroPaginas + "," + " Numero de referencia: " + "ZZZ" + " Prestado: " + vecesPrestado + " Libro de texto: " + infoLibroMostrar);
            }
        }
    }
    public void prestar() {
        vecesPrestado = +1;
    }
}
