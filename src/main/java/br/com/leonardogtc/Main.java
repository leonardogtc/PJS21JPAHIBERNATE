package br.com.leonardogtc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.leonardogtc.dominio.Pessoa;

public class Main {
    public static void main(String[] args) {
        

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulajpamaven");
        EntityManager em = emf.createEntityManager();

        Pessoa p = em.find(Pessoa.class, 2);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        System.out.println("Procedimento executado com sucesso!");
        em.close();
        emf.close();

    }
}