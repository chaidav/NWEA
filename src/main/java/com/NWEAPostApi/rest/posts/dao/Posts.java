package com.NWEAPostApi.rest.posts.dao;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "posts4")
public class Posts {
 
    @Id
    @Column(name="POST_ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "BODY")
    private String body;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}   
}