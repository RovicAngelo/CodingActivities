package ph.edu.sorsu.entity;

public class Subject {
    private Long id;
    private String code;
    private String description;
    private Long numberOfUnits;
    private Course course;

    // The getters and setters of the subject attribute.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(Long numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
