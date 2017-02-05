package com.NWEAPostApi.rest.posts.dao;
 
import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
 
public class PostsDAO {
	
	public List<Posts> getPosts(){
    	System.out.println("inside the get employee in employee dao");
        SessionFactory sessionFactory = SessionUtil.getSessionAnnotationFactory();  
        System.out.println("inside get session annotation factory after getting sf");
        Session session = sessionFactory.openSession();
        Query query =  session.createQuery("from Posts");
        List<Posts> posts =  query.list();
        session.close();
        return posts;
    }
    
    public void addPost(Posts bean){
    	SessionFactory sessionFactory = SessionUtil.getSessionAnnotationFactory();  
        System.out.println("inside get session annotation factory after getting sf");
        Session session = sessionFactory.openSession();        
        Transaction tx = session.beginTransaction();
        System.out.println(bean.getTitle() + bean.getBody());
//        Random rand = new Random();
//        int num = rand.nextInt(11) + 1;
//        String numString = Integer.toString(num);
//        System.out.println("random number: "+ numString);
//        bean.setId(numString);
//        System.out.println("bean in addpost before passing session and bean:" +bean.getId()+bean.getTitle()+bean.getBody());
        addPost(session,bean);        
        tx.commit();
        session.close();
        
    }
    
    private void addPost(Session session, Posts bean){
        Posts post = new Posts();
        System.out.println("Bean holds in add post: "+bean.getId()+bean.getTitle() + bean.getBody());
        
//        post.setId(bean.getId());
        post.setTitle(bean.getTitle());
        post.setBody(bean.getBody());
        System.out.println("post has values: "+post.getId()+" "+post.getTitle()+" "+post.getBody());
        session.save(post);
    }
    
}