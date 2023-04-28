public class Variable {
    private Object value;


    public Variable(String dataType) throws Exception {
        switch (dataType) {
            case "int": value = 0; break;
            case "boolean": value = false; break;
            case "string": value = ""; break;
            default: throw new Exception("invalid data type");
        }

    public Variable(String anInt) {
    }

    public Object getType() {
        return this.value;
    }
    public void setValue(Object value){
        this.value = this.value;

    }

    public Object getValue() {
        return this.value;
    }
    public void setValue(String newValue) {
        switch (getType()) {
            case "int" : value = Integer.parseInt(newValue); break;
            case "boolean" : value = Boolean.parseBoolean(newValue); break;
            case "string" : value = newValue; break;
        }
    }
    public void setValue(Object newValue) throws Exception {
        String dataType = getType();
        if (dataType.equals("int") && newValue instanceof Integer) {
            this.value = newValue;
        } else if (dataType.equals("boolean") && newValue instanceof Boolean) {
            this.value = newValue;
        } else if (dataType.equals("string") && newValue instanceof String) {
            this.value = newValue;
        } else {
            throw new Exception("incompatible type");
        }
    }


    public String getType() {
        if (value instanceof Integer) return "int";
        else if (value instanceof Boolean) return "boolean";
        else if (value instanceof String) return "string";
        else return null;
    }

    public int getInteger() {
        return (Integer) value;
    }
    public boolean getBoolean() {
        return (Boolean) value;
    }
    public String getString() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if (this == object) return true;

        if (this.getClass().equals(object.getClass())) {
            switch (getType()) {
                case "int" : return this.getInteger() == ((Variable) object).getInteger();
                case "boolean" : return this.getBoolean() == ((Variable) object).getBoolean();
                case "string" : return this.getString().equals(((Variable) object).getString());
            }
        }
        return false;
    }
}
