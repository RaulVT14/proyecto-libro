
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
    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginas;
        numeroReferencia = "";
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
        if (numeroReferencia != "") {
            detalles = "Titulo: " + titulo + "," + " Autor: " + autor + "," + " Paginas: " + numeroPaginas + "," + " Numero de referencia: " + numeroReferencia;
        }
        else {
            detalles = "Titulo: " + titulo + "," + " Autor: " + autor + "," + " Paginas: " + numeroPaginas;
        }
        return detalles;
    }
    public String getNumeroReferencia() {
        return numeroReferencia;
    }
    public void setNumeroReferencia(String numero) {
        numeroReferencia = numero;
    }
    public void imprimeAutor() {
        System.out.println("El autor del libro es: " + autor);
    }
    public void imprimeTitulo() {
        System.out.println("El titulo del libro es: " + titulo);
    }
    public void imprimeDetalles() {
        if (numeroReferencia != "") {
            System.out.println("Titulo: " + titulo + "," + " Autor: " + autor + "," + " Paginas: " + numeroPaginas + "," + " Numero de referencia: " + numeroReferencia);
        }
        else {
            System.out.println("Titulo: " + titulo + "," + " Autor: " + autor + "," + " Paginas: " + numeroPaginas);
        }
    }
}
