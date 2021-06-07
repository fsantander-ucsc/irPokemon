/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irPokemon;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Pipe_
 */
public interface irPokemon extends Remote{
    //comentario de prueba
    //comentario de prueba Diego
    //comentario de prueba 2, de Juan
    String pokeHoroscopo (int anho) throws RemoteException;
    ArrayList<String> batalla(String pokemonIngresado) throws RemoteException;
    String consulaPokemon(String pokemonIngresado) throws RemoteException;
    // INICIO FUNCIONES SAFARI
    String safariPokemon () throws RemoteException;
    String arrojarPokebola() throws RemoteException;
    String arrojarPiedra() throws RemoteException;
    String arrojarCebo() throws RemoteException;
    // FIN FUNCINES DEL SAFARI
}
