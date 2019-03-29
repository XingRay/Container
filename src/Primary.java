/**
 *
 */
public enum Primary {

    BOOLEAN("Boolean", "boolean", "Boolean"),
    BYTE("Byte", "byte", "Byte"),
    CHAR("Char", "char", "Character"),
    SHORT("Short", "short", "Short"),
    INT("Int", "int", "Integer"),
    LONG("Long", "long", "Long"),
    FLOAT("Float", "float", "Float"),
    DOUBLE("Double", "double", "Double");

    public final String name;
    public final String type;
    public final String boxName;

    public static final Primary[] PRIMARYS = {
            BOOLEAN, BYTE, CHAR, SHORT, INT, LONG, FLOAT, DOUBLE
    };

    Primary(String name, String type, String boxName) {
        this.name = name;
        this.type = type;
        this.boxName = boxName;
    }
}
