/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.sampleprj.dao;

import edu.eci.pdsw.samples.entities.Monitor;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author tatiana
 */
public interface MonitorDAO {

    public Monitor load(long codigo) throws PersistenceException;

    public void save(Integer codigoID, String nombre, String apellido, String correo, Long telefono, String semestreIngreso, Integer programaAcademico) throws PersistenceException;

    public List<Monitor> consultarMonitores() throws PersistenceException;

    public List<HashMap> consultaMonitorias() throws PersistenceException;

    public List<HashMap> consultaCurso() throws PersistenceException;

    public List<HashMap> consultaGrupo() throws PersistenceException;

    public List<HashMap> consultaTema() throws PersistenceException;
    
    public List<HashMap> consultaGrupoxTema() throws PersistenceException;
    
    public List<HashMap> consultaCursoxMonitor() throws PersistenceException;
    
    public void actualizarMonitor(Integer codigoID, String nombre, String apellido, String correo, Long telefono,
            String semestreIngreso, Integer programaAcademico) throws PersistenceException;

    public void delete(Integer codigo) throws PersistenceException;

}
