package facade;

import entity.*;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class EMFacade {

    private EntityManagerFactory emf;

    public EMFacade(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public ProjectUser createUser(ProjectUser pu) {
        EntityManager em = getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(pu);
            em.flush();
            return pu;
        } finally {
            em.getTransaction().commit();
            em.close();
        }
    }

    public ProjectUser findUser(int id) {
        EntityManager em = getEntityManager();

        try {
            em.getTransaction().begin();
            return em.find(ProjectUser.class, id);
        } finally {
            em.getTransaction().commit();
            em.close();
        }
    }

    public List<ProjectUser> getAllUsers() {
        EntityManager em = getEntityManager();

        try {
            em.getTransaction().begin();
            return (List<ProjectUser>) em.createQuery("SELECT u FROM ProjectUser u").getResultList();
        } finally {
            em.getTransaction().commit();
            em.close();
        }
    }

    public Project createProject(Project p) {
        EntityManager em = getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(p);
            em.flush();
            return p;
        } finally {
            em.getTransaction().commit();
            em.close();
        }
    }

    public Project assignUser(Project p, ProjectUser u) {
        EntityManager em = getEntityManager();

        try {
            em.getTransaction().begin();
            p.addUser(u);
            em.flush();
            em.persist(p);
            em.flush();
            return p;
        } finally {
            em.getTransaction().commit();
            em.close();
        }
    }

    public Project fintProject(int id) {
        EntityManager em = getEntityManager();

        try {
            em.getTransaction().begin();
            return em.find(Project.class, id);
        } finally {
            em.getTransaction().commit();
            em.close();
        }
    }
    
    public Project createTaskAndAssignToProject(Project p, Task t) {
        EntityManager em = getEntityManager();

        try {
            em.getTransaction().begin();
            p.addTask(t);
            em.persist(p);
            em.flush();
            return p;
        } finally {
            em.getTransaction().commit();
            em.close();
        }
    }
    
    public Task findTask(int id) {
        EntityManager em = getEntityManager();

        try {
            em.getTransaction().begin();
            return em.find(Task.class, id);
        } finally {
            em.getTransaction().commit();
            em.close();
        }
    }
    
    public List<Task> getTasksFromProject(int id) {
        EntityManager em = getEntityManager();

        try {
            em.getTransaction().begin();
            return em.find(Project.class, id).getTasks();
        } finally {
            em.getTransaction().commit();
            em.close();
        }
    }
}
