package stringbuilder;

public enum Title {

    MR("Mr."), PROF("Dr.");

    private final String value;

    Title(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }

}
