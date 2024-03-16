# Practica Corba
Este proyecto va a tratar de una implementación de una biblioteca utilizando CORBA
## Las versiones que hemos usado:
- Oracle OpenJDK version 1.8.0_202
- Languaje level: 19
- Además hemos tenido que añadir variables de entorno para este programa
## Ejecución
Para ejecutar esta aplicación hemos abierto una terminal para comando
1. idlj -fall Biblioteca.idl
2. javac ServidorBiblioteca.java
3. javac ClienteBiblioteca.java
4. tnameserv -ORBInitialPort 1050
5. java ServidorBiblioteca -ORBInitialHost localhost -ORBInitialPort 1050
6. java ClienteBiblioteca -ORBInitialHost localhost -ORBInitialPort 1050

## Lo que he añadido a la práctica
- biblioteca.idl: 
  He añadido más atributos y más funciones para comprender mejor como va CORBA
- ServidorBiblioteca.java: 
  Aqui hemos puesto la funcionalidad de las funciones además de añadir más libros al servidor
- ClienteBiblioteca.java: 
  Aqui lo que haremos para cuando se ejecute el cliente, preste libros, cuente los libros por autor y editorial, además de mostrar todos los libros que hay dispoibles después de prestarlos.
