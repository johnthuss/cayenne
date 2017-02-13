package org.apache.cayenne.testdo.things.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.things.Ball;
import org.apache.cayenne.testdo.things.Box;

/**
 * Class _Thing was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Thing extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<Integer> VOLUME = Property.create("volume", Integer.class);
    public static final Property<Integer> WEIGHT = Property.create("weight", Integer.class);
    public static final Property<Ball> BALL = Property.create("ball", Ball.class);
    public static final Property<List<Box>> BOX = Property.create("box", List.class);

    public void setVolume(Integer volume) {
        writeProperty("volume", volume);
    }
    public Integer getVolume() {
        return (Integer)readProperty("volume");
    }

    public void setWeight(Integer weight) {
        writeProperty("weight", weight);
    }
    public Integer getWeight() {
        return (Integer)readProperty("weight");
    }

    public void setBall(Ball ball) {
        setToOneTarget("ball", ball, true);
    }

    public Ball getBall() {
        return (Ball)readProperty("ball");
    }


    @SuppressWarnings("unchecked")
    public List<Box> getBox() {
        return (List<Box>)readProperty("box");
    }


}
