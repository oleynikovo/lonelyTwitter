package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.ArrayList;

public interface SeeFollowing {
	public ArrayList<User> followersList() throws IOException;
}
