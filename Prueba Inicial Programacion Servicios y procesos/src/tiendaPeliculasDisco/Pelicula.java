package tiendaPeliculasDisco;

public class Pelicula extends Producto  {
	
	String genero;
	String director;

	public Pelicula () {
		
		Pelicula elPadrino = new Pelicula();
	}

	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
}
