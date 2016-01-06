package company.com.spinner;

/**
 * Created by ihiu on 06/01/2016.
 */
public class Country {

    private String code;
    private String name;

    public Country(String code, String name){

        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
