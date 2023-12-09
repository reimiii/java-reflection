package franxxcode.reflection.data;

public enum Gender {
    MALE("Laki-Laki"),
    FEMALE("Perempuan");

    private final String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
