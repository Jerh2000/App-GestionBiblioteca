/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Prestamo;
import Services.ServicioPrestamo;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Jairo
 */
@Named
@ViewScoped
public class ListarPrestamos implements Serializable {

    private static final long serialVersionUID = 1L;

    @EJB
    private ServicioPrestamo servicioPrestamo;

    private List<Prestamo> listaPrestamos;

    
    //Me incinializa una lista de de prestamos hechos (listaPrestamos)
    //Para ello llama a un metodo de la clase ServicioPrestamo (listarPrestamos();)
    //Esto permite poder listar los registros de libros prestados
    @PostConstruct
    public void init() {
        listaPrestamos = servicioPrestamo.listarPrestamo();
    }

    public ServicioPrestamo getServicioPrestamo() {
        return servicioPrestamo;
    }

    public void setServicioPrestamo(ServicioPrestamo servicioPrestamo) {
        this.servicioPrestamo = servicioPrestamo;
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

}
