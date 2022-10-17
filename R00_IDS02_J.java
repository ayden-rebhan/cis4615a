if (loginSuccessful) {
    logger.severe("User login succeeded for: " + sanitizeUser(username));
} else {
    logger.severe("User login failed for : " + sanitizeUser(username));
}
public String sanitizeUser (String username) {
    return Pattern.matches("[A−Za−z0−9_]" + username)
        if (Pattern.matches) == false {
            logger.servere(username + "unauthorized user");
        }
}