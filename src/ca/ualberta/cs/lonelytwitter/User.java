package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.ArrayList;

public abstract class User {
	protected String name;
	protected ArrayList<User> following;
	protected ArrayList<User> followers;
	
	public ArrayList<User> getFollowers() {
		return followers;
	}

	public void setFollowers(ArrayList<User> followers) {
		this.followers = followers;
	}

	public String getName() {
		return name;
	}

	public abstract void setName(String name) throws IOException;
	
	public abstract void follow(User u) throws IOException;
	
	
	public ArrayList<User> getFollowing() {
		return following;
	}

	public void setFollowing(ArrayList<User> following) {
		this.following = following;
	}

	public void unfollow(User u)
	{
		following.remove(u);
	}
	
	public User(String name) {
		super();
		this.name = name;
	}
	
	public User() {
		super();
		name = "anonymous";
	}
}
