package ga.rugal.food.common;

/**
 *
 * This interface contain most of referred message content used in
 * {@code Message} feedback.
 *
 * @author Rugal Bernstein
 */
public interface CommonMessageContent
{

    //User operation
    final String SAVE_USER = "User registered";

    final String UPDATE_USER = "User profile updated";

    final String DELETE_USER = "User deleted";

    final String GET_USER = "Get user profile";

    //Authentication and Authorization
    final String ACCESS_FORBIDDEN = "Unmatched combination of username and credential";

    final String PERMISSION_DENIED = "Insufficient permission";

    //Tracker operations
    final String TRACKER_STARTED = "Tracker started";

    final String TRACKER_STOPPED = "Tracker stopped";

    final String TRACKER_NOT_STARTED = "Tracker start failed";

    final String TRACKER_NOT_STOPPED = "Tracker stop failed";

    final String TRACKER_RUNNING = "Tracker is running";

    final String TRACKER_NOT_RUNNING = "Tracker is not running";

    //Torrents
    final String TORRENT_NOT_FOUND = "The request torrent not found";

    //Signin
    final String SIGNIN = "Signin recorded";

    //Announce
    final String INVALID_INFOHASH = "Info hash invalid";

    final String INVALID_PEERID = "Peer ID invalid";

    final String USER_NOT_FOUND = "User not found";

    final String UNSUPPORTED_CLIENT = "Client software unsupported";

    final String INVALID_UID = "UID format invalid";

    final String INVALID_CREDENTIAL = "Credential format invalid";

    final String BAD_EVENT = "Bad client event";

    //Post operations
    final String SAVE_POST = "Post persisted";

    final String DELETE_POST = "Post deleted";

    final String UPDATE_POST = "Post updated";

    final String GET_POST = "Get post";

    //Thread operations
    final String SAVE_THREAD = "Thread persisted";

    final String DELETE_THREAD = "Thread deleted";

    final String UPDATE_THREAD = "Thread updated";

    final String GET_THREAD = "Get thread";

    //Tag operations
    final String SAVE_TAG = "Tag persisted";

    final String DELETE_TAG = "Tag deleted";

    final String UPDATE_TAG = "Tag updated, old tag removed";

    final String TAG_NOT_UPDATED = "Unable to update tag, keep old one";

    final String GET_TAG = "Get tag";

    final String TAG_NOT_SAVED = "Unable to save Tag icon";

    final String TAG_NOT_FOUND = "No such tag found";

}
