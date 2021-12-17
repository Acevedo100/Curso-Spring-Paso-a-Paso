package com.springsimplespasos.hibernate.pruebas;

import com.springsimplespasos.hibernate.entidades.SimpleEntity;
import com.springsimplespasos.hibernate.util.HibernateUtil;
import org.hibernate.Session;

public class HibernateMain {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSeccionSessionFactory().openSession(); // Objeto de la conexion
        session.beginTransaction();  // comenzamos la transaccion

        // Insert
        /*SimpleEntity entity = new SimpleEntity(); // objeto entity para usar la clase creada.
        entity.setNombre("Descripcion "); // por medio del setter le envias el valor al atributo
        session.save(entity);        // se le pasa como parametro objeto a paersistir
         */

        //Update
        /*SimpleEntity entityUpdate = new SimpleEntity();
        entityUpdate.setCodigo(2);
        entityUpdate.setNombre("Descripcion Update");
        session.update(entityUpdate);
         */

        //Delete
        /*SimpleEntity entityDelete = new SimpleEntity();
        entityDelete.setCodigo(1);
        session.delete(entityDelete);
         */

        SimpleEntity entityRead = session.get(SimpleEntity.class,2);
        System.out.println(entityRead.getNombre());

        session.getTransaction().commit(); // Se carga el commit del objeto que se envio
        session.close();                   // Cerramos conexion
    }

}
