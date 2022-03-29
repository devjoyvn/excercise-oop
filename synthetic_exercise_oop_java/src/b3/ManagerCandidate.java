package b3;

import java.util.ArrayList;
import java.util.List;

public class ManagerCandidate {
    List<Candidate> candidates;
    public ManagerCandidate() {
        this.candidates = new ArrayList<>();
    }

    public void add(Candidate candidate) {
        this.candidates.add(candidate);
    }

    public void showInfor() {
        this.candidates.forEach(candidate -> System.out.println(candidate.toString()));
    }

    public Candidate searchById(String id) {
        return this.candidates.stream().filter(candidate -> candidate.getId().equals(id)).findFirst().orElse(null);
    }


}
