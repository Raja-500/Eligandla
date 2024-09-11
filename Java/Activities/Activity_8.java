package Activities;

class CustomException extends Exception{
    private String message;
    CustomException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}



public class Activity_8 {
    static void exceptionTest(String str) throws CustomException{
        if (str == null){
            throw new CustomException("This is Customized error");
        }
        else {
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        try{
            Activity_8.exceptionTest("My name is lakhan");
            Activity_8.exceptionTest(null);
            Activity_8.exceptionTest("sorry man i moved to catch block");
        }
        catch (CustomException obj){
            System.out.println(obj.getMessage());
        }
    }
}
