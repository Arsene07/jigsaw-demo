package fr.zenika.iki.recruitment.domain;

public class Test {
    private long id;
    private long gardeOn20;

    public Test(long id, long gardeOn20) {
        this.id = id;
        this.gardeOn20 = gardeOn20;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getGardeOn20() {
        return gardeOn20;
    }

    public void setGardeOn20(long gardeOn20) {
        this.gardeOn20 = gardeOn20;
    }
}
