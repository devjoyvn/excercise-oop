package entity;

import java.time.LocalDate;

public class Certificate {
    private String id;
    private String name;
    private String rank;
    private LocalDate date;

    public Certificate() {
    }

    public Certificate(String id, String name, String rank, LocalDate date) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
