package inventario.utez.edu.mx.Integradora.mx.utez.edu.ingrediente.model;

import inventario.utez.edu.mx.Integradora.mx.utez.edu.areaIngrediente.model.AreaIngrediente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "Ingrediente")
@XmlAccessorType(XmlAccessType.FIELD)
public class Ingrediente {

    private int idIngrediente;
    private String nombreIngrediente;
    private AreaIngrediente idAreaIngrediente;

    public Ingrediente() {
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int id_Ingrediente) {
        this.idIngrediente = id_Ingrediente;
    }

    public String getNombreIngrediente() {
        return nombreIngrediente;
    }

    public void setNombreIngrediente(String nombreIngrediente) {
        this.nombreIngrediente = nombreIngrediente;
    }

    public AreaIngrediente getIdAreaIngrediente() {
        return idAreaIngrediente;
    }

    public void setIdAreaIngrediente(AreaIngrediente idAreaIngrediente) {
        this.idAreaIngrediente = idAreaIngrediente;
    }
}
