/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labor5.FileUtils;

/**
 *
 * @author tibaa
 */
public class Hullámvasút {

    String név;
    String világ;
    int l_magasság;
    int idő;

    public Hullámvasút(String név, String világ, int l_magasság, int idő) {
        this.név = név;
        this.világ = világ;
        this.l_magasság = l_magasság;
        this.idő = idő;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public String getVilág() {
        return világ;
    }

    public void setVilág(String világ) {
        this.világ = világ;
    }

    public int getL_magasság() {
        return l_magasság;
    }

    public void setL_magasság(int l_magasság) {
        this.l_magasság = l_magasság;
    }

    public int getIdő() {
        return idő;
    }

    public void setIdő(int idő) {
        this.idő = idő;
    }

    @Override
    public String toString() {
        return this.név + "(" + this.világ + ") " + this.idő;
    }

}
