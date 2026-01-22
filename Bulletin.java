package Entities;

public class Bulletin {

    private String[] disciplines = {"Math", "Physic", "Programming"};
    private int students;

    Double[][] notes = new Double[2][3];

    public Bulletin(String[] disciplines, int students, Double[][] notes) {
        super();
        this.disciplines = disciplines;
        this.students = students;
        this.notes = notes;
    }

    public Bulletin() {
    }

    public String[] getDisciplines() {
        return disciplines;
    }
    public void setDisciplines(String[] disciplines) {
        this.disciplines = disciplines;
    }

    public int getStudents() {
        return students;
    }
    public void setStudents(int students) {
        this.students = students;
    }

    public Double[][] getNotes() {
        return notes;
    }
    public void setNotes(Double[][] notes) {
        this.notes = notes;
    }

}
