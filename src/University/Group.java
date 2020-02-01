package University;

public class Group extends Faculty {
    protected int groupNumber;

    public Group(){

    }

    public Group(Faculty faculty,  int GroupNumber){
        this.groupNumber = GroupNumber;
    }
}
