import com.victorkzk.furniture.Furniture;

public class Sofa extends Furniture {
    public enum Type {
        ACCUBITA, CANAPE, DAVENPORT, CLINAI
    }

    private Type type;

    public Sofa(int length, int width, int height) {
        super(length, width, height);
        super.name = "Sofa";
    }

    @Override
    public Object[] getTypesList() {
        Type[] types = Type.values();
        return types;
    }

    @Override
    public void setType(Object type) {
        this.type = (Type)type;
    }

    @Override
    public Object getType() {
        return type;
    }
}
