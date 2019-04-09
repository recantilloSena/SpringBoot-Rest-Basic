/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.demo.repository;

import com.adsi.demo.modelo.Canchas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Ricardo
 */
public interface CanchasRepository extends JpaRepository<Canchas, Integer>{
    
    
    
    //Consulta Generada por Estandar de Nombres
    List<Canchas> findByNombre(@Param("nombre") String nombre );
    
    //Consulta por JPA
    @Query("SELECT c FROM Canchas c WHERE c.valorXMinuto = :valorXMinuto")
    List<Canchas> buscarPorValor(@Param("valorXMinuto") int valorXMinuto);
    
    //SQL Native
    @Query(value = "SELECT dimensiones, count(*) total FROM canchas group by dimensiones", nativeQuery = true)
    List<Object> getTotales();
    
}
