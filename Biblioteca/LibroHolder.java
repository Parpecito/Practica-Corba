package Biblioteca;

/**
* Biblioteca/LibroHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Biblioteca.idl
* viernes 15 de marzo de 2024 23H51' CET
*/

public final class LibroHolder implements org.omg.CORBA.portable.Streamable
{
  public Biblioteca.Libro value = null;

  public LibroHolder ()
  {
  }

  public LibroHolder (Biblioteca.Libro initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Biblioteca.LibroHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Biblioteca.LibroHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Biblioteca.LibroHelper.type ();
  }

}
