package com.myfacebook;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myfacebook.model.Post;

public class Test {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		Post post = new Post();
		post.setEmail("nag@gmail.com");
		post.setMessage("I hate this tnr");


		Post post2 = new Post();
		post2.setEmail("ria@gmail.com");
		post2.setMessage("he is my dad");

		List<Post> posts = new ArrayList<>();
		posts.add(post);
		posts.add(post2);

		final StringWriter sw = new StringWriter();
		final ObjectMapper mapper = new ObjectMapper();

		mapper.writeValue(sw, posts);

		System.out.println(sw.toString());

	}

}
