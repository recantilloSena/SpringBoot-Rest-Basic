/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.demo.rest;

import com.adsi.demo.modelo.Canchas;
import com.adsi.demo.repository.CanchasRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ricardo
 */

@RestController
public class CanchasRest {
    
    @Autowired
    private CanchasRepository canchasRepository;
    
    /**
     *
     * @return Canchas
     */
    @RequestMapping(value = "/rest/canchas/list",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
    public List<Canchas> findAll () {
        return  canchasRepository.findAll();
    }
    
    @RequestMapping(value = "/rest/canchas/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
    public Optional<Canchas> findById (@PathVariable("id") Integer id ) {
        return  canchasRepository.findById(id);
    }
    
    @RequestMapping(value = "/rest/canchas/nombre/{nombre}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
    public List<Canchas> findByNombre (@PathVariable("nombre") String nombre ) {
        return  canchasRepository.findByNombre(nombre);
    }
    
    @RequestMapping(value = "/rest/canchas/valor/{valor}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
    public List<Canchas> findByValor (@PathVariable("valor") Integer valorXMinuto ) {
        return  canchasRepository.buscarPorValor(valorXMinuto);
    }
    
    @RequestMapping(value = "/rest/canchas/total",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
    public List<Object> getTotales(){
        return canchasRepository.getTotales();
    }
    
    
    
    @RequestMapping(value = "/rest/canchas/save",
                    method = RequestMethod.POST, 
                    produces = MediaType.APPLICATION_JSON_VALUE,
                    consumes = MediaType.APPLICATION_JSON_VALUE)
    public Canchas newCanchas (@RequestBody Canchas canchas  ) {
        return  canchasRepository.save(canchas);
    }
    
    
    
    
    
    
}
