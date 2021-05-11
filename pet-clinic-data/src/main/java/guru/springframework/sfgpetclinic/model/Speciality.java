package guru.springframework.sfgpetclinic.model;

/**
 * Created by gs on 11/05/2021.
 **/
public class Speciality extends BaseEntity {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
