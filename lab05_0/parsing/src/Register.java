public class Register {
    private String type;
    private int id;
    private String name;
    private boolean isConst;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Register(String type, int id, boolean isConst){
        this.type = type;
        this.id = id;
        this.name = "%x" + this.getId();
        this.isConst = isConst;
    }
    public String getType() {
        return type;
    }
    public boolean isConst() {
        return isConst;
    }
    public void setConst(boolean isConst) {
        this.isConst = isConst;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getId(){
        return Integer.toString(this.id);
    }
    @Override
    public String toString() {
        return this.name;
    }
}
