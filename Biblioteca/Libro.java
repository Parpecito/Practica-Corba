package Biblioteca;


/**
* Biblioteca/Libro.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Biblioteca.idl
* viernes 15 de marzo de 2024 23H51' CET
*/

public final class Libro implements org.omg.CORBA.portable.IDLEntity
{
  public String titulo = null;
  public String autor = null;
  public String ISBN = null;
  public boolean estaDisponible = false;
  public String editorial = null;
  public String fechaPublicacion = null;

  public Libro ()
  {
  } // ctor

  public Libro (String _titulo, String _autor, String _ISBN, boolean _estaDisponible, String _editorial, String _fechaPublicacion)
  {
    titulo = _titulo;
    autor = _autor;
    ISBN = _ISBN;
    estaDisponible = _estaDisponible;
    editorial = _editorial;
    fechaPublicacion = _fechaPublicacion;
  } // ctor

} // class Libro
