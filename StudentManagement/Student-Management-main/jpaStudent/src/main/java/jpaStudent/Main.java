package jpaStudent;

import jakarta.persistence.EntityManager;

public class Main {

    public static void main(String[] args) {
        EntityManager st = JPAUtil.getEntityManager(); 

        st.getTransaction().begin();
        
      
        Student stu1 = new Student("sneha", "female", "ECE");
        st.persist(stu1);

       
        Student stu2 = st.find(Student.class, 1);  

      
        
            System.out.println(stu2.getName());
            System.out.println(stu2.getGender());
            System.out.println(stu2.getDepartment()); 
      
            stu2.setName("Swetha");
            stu2.setDepartment("CSE");
            st.merge(stu2);
            
            st.remove(stu2);
           
        st.getTransaction().commit();
        st.close();
        JPAUtil.close();
    }
}
