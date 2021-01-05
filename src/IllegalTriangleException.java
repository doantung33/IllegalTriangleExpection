public class IllegalTriangleException extends  Exception{
   public String message;

    public IllegalTriangleException(String message) {
        super(message);
        this.message = message;
    }
}
