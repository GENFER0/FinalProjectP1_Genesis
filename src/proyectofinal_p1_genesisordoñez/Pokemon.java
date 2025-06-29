/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal_p1_genesisordoñez;

/**
 *
 * @author genfe
 */
public class Pokemon {
    private String pokName;
    private double pokLife;
    private double pokDefender;
    private int pokLevel;
    private int pokAttack;

    public Pokemon(String pokName, double pokLife, double pokDefender, int pokLevel, int pokAttack) {
        this.pokName = pokName;
        this.pokLife = pokLife;
        this.pokDefender = pokDefender;
        this.pokLevel = pokLevel;
        this.pokAttack = pokAttack;
    }

    public String getPokName() {
        return pokName;
    }

    public void setPokName(String pokName) {
        this.pokName = pokName;
    }

    public double getPokLife() {
        return pokLife;
    }

    public void setPokLife(double pokLife) {
        this.pokLife = pokLife;
    }

    public double getPokDefender() {
        return pokDefender;
    }

    public void setPokDefender(double pokDefender) {
        this.pokDefender = pokDefender;
    }

    public int getPokLevel() {
        return pokLevel;
    }

    public void setPokLevel(int pokLevel) {
        this.pokLevel = pokLevel;
    }

    public int getPokAttack() {
        return pokAttack;
    }

    public void setPokAttack(int pokAttack) {
        this.pokAttack = pokAttack;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "pokName=" + pokName + ", pokLife=" + pokLife + ", pokDefender=" + pokDefender + ", pokLevel=" + pokLevel + ", pokAttack=" + pokAttack + '}';
    }
    
    
}
