/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sw;

/**
 *
 * @author DELL
 */
public class Cliente {
    private String user;
    private String pass;
    private double saldo;

    public Cliente() {
    }

    public Cliente(String user, String pass, double saldo) {
        this.user = user;
        this.pass = pass;
        this.saldo = saldo;
    }



    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + ", user=" + user + ", pass=" + pass + ", saldo=" + saldo + '}';
    }

    
    
    
}
