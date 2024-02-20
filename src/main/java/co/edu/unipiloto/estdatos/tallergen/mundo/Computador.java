/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.estdatos.tallergen.mundo;

/**
 *
 * @author medin
 */
public class Computador extends Electronico {
    
    public enum SisOperativo{
        windonws, linux, mac
    }
    
    private SisOperativo sisOperativo;
    
    public Computador(Gama pGama, double pPrecio, SisOperativo pOperador)
	{
		super(pGama, pPrecio);
		sisOperativo = pOperador;
	}
    public String toString()
	{
		return "Computador "+sisOperativo.name()+" - "+"Gama "+gama;
	}
    
}
