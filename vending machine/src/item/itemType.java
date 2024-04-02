package item;

public enum ItemType {
    OREO("OREO"), 
    JUICE("JUICE"), 
    COKE("COKE"), 
    SODA("SODA"), 
    CHIPS("CHIPS"), 
    CHOCOLATE("CHOCOLATE"), 
    CANDY("CANDY"), 
    GUM("GUM"); 

    private final String type;
    ItemType (String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
