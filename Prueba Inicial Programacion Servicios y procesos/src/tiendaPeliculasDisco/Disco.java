package tiendaPeliculasDisco;

public class Disco extends Producto  {
	
	String genero_musica;
	String grupo;
	int stock;
	
	public Disco() {
		
		//Creo los objetos
		Disco nevermind = new Disco(); 
		Disco meteora = new Disco();
		Disco masterOfPuppets = new Disco();
	}


	public String getGenero_musica() {
		return genero_musica;
	}

	public void setGenero_musica(String genero_musica) {
		this.genero_musica = genero_musica;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
	
	
	