package org.apache.cayenne.testdo.generated.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.generated.GeneratedColumnTestEntity;

/**
 * Class _GeneratedColumnDep was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _GeneratedColumnDep extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String GENERATED_COLUMN_FK_PK_COLUMN = "GENERATED_COLUMN_FK";

    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<GeneratedColumnTestEntity> TO_MASTER = Property.create("toMaster", GeneratedColumnTestEntity.class);

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setToMaster(GeneratedColumnTestEntity toMaster) {
        setToOneTarget("toMaster", toMaster, true);
    }

    public GeneratedColumnTestEntity getToMaster() {
        return (GeneratedColumnTestEntity)readProperty("toMaster");
    }


}
