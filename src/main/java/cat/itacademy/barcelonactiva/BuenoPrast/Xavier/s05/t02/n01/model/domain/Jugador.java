package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.dto.JugadorDto;


@Entity
@Table(name="jugadors")
public class Jugador {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="jugador_id")
	private int idJugador;
	
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="exits")
	private double exits;

	@OneToMany(mappedBy = "jugador")
	private List<Jugada> jugades;
	
	public Jugador(int idJugador, String nom) {
		this.idJugador = idJugador;
		this.nom = nom;
	}


	public Jugador() {
	}

	public Jugador(JugadorDto jugador) {
		
		this.idJugador=jugador.getIdJugador();
		this.nom=jugador.getNom();
		this.exits=jugador.getExits();
	}

	public int getIdJugador() {
		return idJugador;
	}


	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public double getExits() {
		return exits;
	}


	public void setExits(double exits) {
		this.exits = exits;
	}
	
	
	
}
