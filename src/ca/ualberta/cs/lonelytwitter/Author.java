package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class Author extends User implements UserLike, SeeFollowing {

	public Author(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	public void follow(User u) {
		
		following.add(u);
		
	}

	public ArrayList<User> followersList() {
		return this.followers;
	}

}
