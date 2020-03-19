package viewnext.workshop.spring.j2ee.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import viewnext.workshop.spring.j2ee.model.User;

@Repository
public class UserDaoImpl implements UserDao {
 
   @Autowired
   private SessionFactory sessionFactory;
 
   @Override
   public void create(User user) {
      sessionFactory.getCurrentSession().save(user);
   }
 
   @Override
   public List<User> getAll() {
      @SuppressWarnings("unchecked")
      TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
      return query.getResultList();
   }
}
