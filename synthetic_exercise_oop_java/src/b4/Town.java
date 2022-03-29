package b4;

import java.util.ArrayList;
import java.util.List;

public class Town {
    List<Family> families;

    public Town() {
        this.families = new ArrayList<>();
    }

    public List<Family> getFamilies() {
        return families;
    }

    public void setFamilies(List<Family> families) {
        this.families = families;
    }

    public void addFamily(Family family) {
        this.families.add(family);
    }
}
