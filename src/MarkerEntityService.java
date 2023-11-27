public class MarkerEntityService {
    public void save(Object obj) throws InvalidEntityFoundException {
        if(!(obj instanceof MarkerEntity)){
            System.out.print("Errrrrr.............................");
            throw new InvalidEntityFoundException("This is not object of marker entity");
        }else{
            System.out.print("SucceessFully done");
        }
    }
}
