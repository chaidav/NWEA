package com.NWEAPostApi.rest.posts;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.NWEAPostApi.rest.posts.dao.Posts;
import com.NWEAPostApi.rest.posts.dao.PostsDAO;

/**
 * Root resource (exposed at "comment" path)
 */
@Path("comment")
public class MyResource {
	// GET all Employees for DB
	@GET
	@Path("/posts")
	@Produces("application/json")
	public List<Posts> getPosts() {
		PostsDAO dao = new PostsDAO();
		List posts = dao.getPosts();
		return posts;
	}

	// POST value to DB
	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response addPost(Posts pst) {
		pst.setTitle(pst.getTitle());
		pst.setBody(pst.getBody());

		PostsDAO dao = new PostsDAO();
		dao.addPost(pst);

		return Response.ok().build();
	}
}