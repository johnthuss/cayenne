package org.apache.cayenne.testdo.relationships_collection_to_many.auto;

import java.util.Collection;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.relationships_collection_to_many.CollectionToManyTarget;

/**
 * Class _CollectionToMany was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CollectionToMany extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<Collection<CollectionToManyTarget>> TARGETS = Property.create("targets", Collection.class);

    public void addToTargets(CollectionToManyTarget obj) {
        addToManyTarget("targets", obj, true);
    }
    public void removeFromTargets(CollectionToManyTarget obj) {
        removeToManyTarget("targets", obj, true);
    }
    @SuppressWarnings("unchecked")
    public Collection<CollectionToManyTarget> getTargets() {
        return (Collection<CollectionToManyTarget>)readProperty("targets");
    }


}
