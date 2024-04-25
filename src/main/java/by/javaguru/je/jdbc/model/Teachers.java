package by.javaguru.je.jdbc.model;

public class Teachers {
    private long id;
    private String name;
    private long subjectId;

    public Teachers() {}

    public Teachers(long id, String name, long subject_id) {
        this.id = id;
        this.name = name;
        this.subjectId = subject_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getsubjectId() {
        return subjectId;
    }

    public void setSubject_id(long subjectId) {
        this.subjectId = subjectId;
    }
}

