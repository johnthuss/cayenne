package org.apache.cayenne.testdo.inheritance_flat.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.inheritance_flat.User;

/**
 * Class _UserProperties was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _UserProperties extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "id";

    public static final Property<Long> ID = Property.create("id", Long.class);
    public static final Property<String> NICKNAME = Property.create("nickname", String.class);
    public static final Property<User> USER = Property.create("user", User.class);

    public void setId(Long id) {
        writeProperty("id", id);
    }
    public Long getId() {
        return (Long)readProperty("id");
    }

    public void setNickname(String nickname) {
        writeProperty("nickname", nickname);
    }
    public String getNickname() {
        return (String)readProperty("nickname");
    }

    public void setUser(User user) {
        setToOneTarget("user", user, true);
    }

    public User getUser() {
        return (User)readProperty("user");
    }


}
