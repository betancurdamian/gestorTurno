/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import model.HorarioAtencionTurno;

/**
 *
 * @author Ariel
 */
public class HorarioAtencionTurnoJpaController implements Serializable {

    public HorarioAtencionTurnoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(HorarioAtencionTurno horarioAtencionTurno) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(horarioAtencionTurno);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(HorarioAtencionTurno horarioAtencionTurno) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            horarioAtencionTurno = em.merge(horarioAtencionTurno);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = horarioAtencionTurno.getId();
                if (findHorarioAtencionTurno(id) == null) {
                    throw new NonexistentEntityException("The horarioAtencionTurno with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            HorarioAtencionTurno horarioAtencionTurno;
            try {
                horarioAtencionTurno = em.getReference(HorarioAtencionTurno.class, id);
                horarioAtencionTurno.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The horarioAtencionTurno with id " + id + " no longer exists.", enfe);
            }
            em.remove(horarioAtencionTurno);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<HorarioAtencionTurno> findHorarioAtencionTurnoEntities() {        
        return findHorarioAtencionTurnoEntities(true, -1, -1);
    }

    public List<HorarioAtencionTurno> findHorarioAtencionTurnoEntities(int maxResults, int firstResult) {
        return findHorarioAtencionTurnoEntities(false, maxResults, firstResult);
    }

    private List<HorarioAtencionTurno> findHorarioAtencionTurnoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(HorarioAtencionTurno.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public HorarioAtencionTurno findHorarioAtencionTurno(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(HorarioAtencionTurno.class, id);
        } finally {
            em.close();
        }
    }

    public int getHorarioAtencionTurnoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<HorarioAtencionTurno> rt = cq.from(HorarioAtencionTurno.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
