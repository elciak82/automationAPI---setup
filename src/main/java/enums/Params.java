package enums;

public enum Params {

    OUTPUT_FORMAT_JSON("?output_format=JSON");

    private final String param;


    Params(String param) {
        this.param = param;
    }

    public String getParam() {
        return param;
    }
}
