# Actividad: Estructura de Objetos en Java con Maven


## Descripcion del proyecto

Este proyecto fue desarrollado en Java utilizando Maven. El objetivo principal es comprender la estructura basica de la Programacion Orientada a Objetos (POO) mediante la creacion de clases, atributos, metodos y objetos.

Se implementa una clase llamada Auto, la cual representa un objeto del mundo real, y una clase principal llamada Main donde se crean y se prueban varios objetos de tipo Auto.

---

## Conceptos de Programacion Orientada a Objetos

### Clase

Una clase es una plantilla que permite definir las caracteristicas y comportamientos de un objeto. En este proyecto, la clase Auto define los atributos y metodos que describen a un auto.

### Objeto

Un objeto es una instancia de una clase. En la clase Main se crean dos objetos diferentes de la clase Auto, cada uno con valores distintos para sus atributos.

### Atributo

Un atributo es una variable que representa una caracteristica del objeto. La clase Auto contiene los siguientes atributos:
marca, modelo, color y velocidad.

Los atributos fueron declarados sin el modificador public, quedando con acceso por defecto, de acuerdo con las indicaciones del ejercicio.

### Metodo

Un metodo es una funcion que representa una accion que el objeto puede realizar. En la clase Auto se implementaron metodos como encender, acelerar, frenar y mostrarInformacion.

---

## Ejecucion del proyecto con Maven

Para compilar el proyecto desde la terminal se utiliza el siguiente comando:

mvn clean compile

Para ejecutar la aplicacion se utiliza el siguiente comando:

mvn exec:java -Dexec.mainClass="com.actividad.Main"

---

## Reflexion sobre el uso de modificadores de acceso

En esta practica no se utilizo el modificador de acceso private ni public en los atributos, ya que el objetivo era trabajar la estructura basica de los objetos sin aplicar encapsulamiento.

En proyectos reales, el uso de private es importante para proteger los datos del objeto y controlar su acceso, lo cual se aplicara en ejercicios posteriores.

---

## Conclusion

Con este proyecto se reforzaron los conceptos basicos de la Programacion Orientada a Objetos en Java, asi como el uso de Maven para la estructura y ejecucion de proyectos.
