package org.finra.springboothibernate.controller;

import java.util.Arrays;

import org.finra.springboothibernate.model.Post;
import org.finra.springboothibernate.model.PostDetails;
import org.finra.springboothibernate.model.oneToMany.Cart;
import org.finra.springboothibernate.model.oneToMany.Item;
import org.finra.springboothibernate.service.PostService;
import org.finra.springboothibernate.service.oneToMany.CartService;
import org.finra.springboothibernate.service.oneToMany.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private ItemService itemService;

	@GetMapping("/")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/getPost/{id}")
	public String getPost(@PathVariable int id) {
//		Post post = postService.findById(1L).get();
//		System.out.println("Post Id: " + post.id);
		
		PostDetails postDetails = new PostDetails("10-29-2019");
		Post newPost = new Post();
		newPost.setTitle("New title");
		newPost.setDetails(postDetails);
		
		postService.addPost(newPost);
		
		return "post";
	}
	
	@GetMapping("/addCart")
	public String addCart() {
		Item item1 = new Item();
		Item item2 = new Item();
		Item item3 = new Item();
		
		Cart cart1 = new Cart();
		Cart cart2 = new Cart();
		
		cart1.setItems(Arrays.asList(item1, item2));
		cart2.setItems(Arrays.asList(item3));
		
		item1.setCart(cart1);
		item2.setCart(cart1);
		item3.setCart(cart1);
	
		cartService.addCart(cart1);
		cartService.addCart(cart2);
		
		itemService.addItem(item1);
		itemService.addItem(item2);
		itemService.addItem(item3);
		
		return "cart";
	}
	
	@GetMapping("/deleteCart/{id}")
	public String deleteCart(@PathVariable Long id) {
		Cart toBeDeleteCart = cartService.findById(id);
		cartService.deleteCart(toBeDeleteCart);
		
		return "cart is deleted";
	}
}
