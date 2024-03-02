package application;

import java.time.LocalDateTime;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {

		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		
		String content = "I'm going to visit this wonderful country!";
		Post p1 = new Post(LocalDateTime.parse("2018-06-21T13:05:44"),
				"Traveling to New Zealand",
				content, 12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
	}

}
