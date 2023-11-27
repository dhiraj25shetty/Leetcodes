public class MarkerEntityDemo {
    public static void main(String args[]) throws InvalidEntityFoundException {
        EmployeeMI e =new EmployeeMI();
        MarkerEntityService m=new MarkerEntityService();
        m.save(e);
    }
}
