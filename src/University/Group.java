package University;

public class Group extends Faculty {
    protected int GroupNumber;

    public Group(){

    }

    public Group(Faculty faculty,  int GroupNumber){
        this.GroupNumber = GroupNumber;
    }
}
