public class Class {
    private int id;
    private String name;
    private boolean watched;
    private Teacher teacher = new Teacher();

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public boolean getWatched(){
        return this.watched;
    }
    public void toWatch(boolean value){
        this.watched=value;
    }
    public void setTeacher(int id,String name,String cpf, String email){
        this.teacher.setId(id);
        this.teacher.setName(name);
        this.teacher.setCpf(cpf);
        this.teacher.setEmail(email);
    }
    public Teacher getTeacher(){
        return this.teacher;
    }
}
