/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

/**
 *
 * @author Jairo
 */
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import Model.Libro;

@Stateless

public class ServicioLibro {

    private List<Libro> libros = new ArrayList<Libro>();

    //Metodo que me guarda el libro, es llamado desde el Bean RegistrarLibro
    public void create(Libro libro) {
        libros.add(libro);
    }

    
    //Metodo que me permite actualizar o modificar un libro --Esta inconcluso aun
    public void Actualizar(Libro libro) {
        libro.setCodigoRegistro(libro.getCodigoRegistro());
        libro.setISBN(libro.getISBN());
        libro.setNombreLibro(libro.getNombreLibro());
        libro.setAutor(libro.getAutor());
        libro.setPais(libro.getPais());
        libro.setNumeroPaginas(libro.getNumeroPaginas());
        libro.setEditorial(libro.getEditorial());
        libro.setIdioma(libro.getIdioma());
        libro.setFechaPublicacion(libro.getFechaPublicacion());
        libro.setEstadoPrestamo(libro.getEstadoPrestamo());
    }
    
    //Meotodo para eliminar un registro de un libro, es llamado desde el Bean EliminarLibro
    public void Eliminar(Libro libroEliminar){
        libros.remove(libroEliminar);
    }
    
    
    //Este metodo me permite obtener un objeto o registro de libro ya sea para eliminarlo o modificarlo
    //Es llamado desde el init del Bean EliminarLibro y ActualizarLibro(Este aun esta inconcluso)
    public Libro ObtenerLibro(String codRegistro){
        Libro objetoLibro = new Libro();
        for (int i = 0; i < libros.size(); i++) {
            if(libros.get(i).getCodigoRegistro().equals(codRegistro)){
                objetoLibro = libros.get(i);
                
            }
        }
        return objetoLibro;
    }
    
    public Libro ObtenerLibroPorISBN(String isbn){
        Libro objetoLibro = new Libro();
        for (int i = 0; i < libros.size(); i++) {
            if(libros.get(i).getISBN().equals(isbn)){
                objetoLibro = libros.get(i);
                
            }
        }
        return objetoLibro;
    }
    
    public Libro ObtenerLibroPorNombre(String nomLibro){
        Libro objetoLibro = new Libro();
        for (int i = 0; i < libros.size(); i++) {
            if(libros.get(i).getNombreLibro().equals(nomLibro)){
                objetoLibro = libros.get(i);
                
            }
        }
        return objetoLibro;
    }
    
    
    public List<Libro> getLibros() {
        return libros;
    }
    
    public List<Libro> listarLibros(){
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    
  
}
