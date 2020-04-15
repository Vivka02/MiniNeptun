package MiniNeptun.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name ="SUBJECT")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Subject implements Serializable {

    @Id
    @NotNull
    @Column
    private int id;

    @NotNull
    @Column
    private String semester;

    @NotNull
    @Column
    private String name;

    @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
    private List<Course> courses;

    public Subject(@NotNull int id, @NotNull String semester, @NotNull String name) {
        this.id = id;
        this.semester = semester;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
