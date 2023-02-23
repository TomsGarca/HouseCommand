public class DoorClCommand implements Command{
        private Door door;
        public DoorClCommand(Door door){
            this.door = door;
        } 
        
        public void execute(){
            door.CLOSE();
        }
    
}
