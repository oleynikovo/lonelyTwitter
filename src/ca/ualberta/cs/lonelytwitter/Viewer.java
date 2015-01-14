package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.ArrayList;

public class Viewer extends User implements SeeFollowing{

	
	
	public void setName(String name) throws IOException
	{
		if (name.length() > 8)
		{
			throw new IOException("Too long");
		}
		this.name = name;
	}

	@Override
	public void follow(User u) throws IOException {
		if (following.size() > 10)
		{
			throw new IOException("Following too many. Become an Author to follow more for just $9.99/month!");
		}
		following.add(u);	
		
	}

	public ArrayList<User> followersList() throws IOException {
		throw new IOException("Cannot see followers as a Viewer. Become an Author to see your followers for just $9.99/month!");
	}
	
	

}
