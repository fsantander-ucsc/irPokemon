/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irPokemon;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Pipe_
 */
public interface irPokemon extends Remote{
    String pokeHoroscopo (int anho) throws RemoteException;    
}
