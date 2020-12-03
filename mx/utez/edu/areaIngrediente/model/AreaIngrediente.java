package inventario.utez.edu.mx.Integradora.mx.utez.edu.areaIngrediente.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "AreaIngrediente")
@XmlAccessorType(XmlAccessType.FIELD)
public class AreaIngrediente {

    private int idIngrediente;
    private int idArearIngrediente;
    private String nombreArea;

    public AreaIngrediente() {
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public int getIdArearIngrediente() {
        return idArearIngrediente;
    }

    public void setIdArearIngrediente(int idArearIngrediente) {
        this.idArearIngrediente = idArearIngrediente;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }
}
