package entity;

public class Song {
    private static int autoId;
    private int id;
    private String name;
    private String singer;

    public Song(String name, String singer) {
        this.id = ++autoId;
        this.name = name;
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}
