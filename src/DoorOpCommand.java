public class DoorOpCommand {
    private Door door;
    public DoorOpCommand(Door door){
        this.door = door;
    } 
    
    public void execute(){
        door.OPEN();
    }
}
