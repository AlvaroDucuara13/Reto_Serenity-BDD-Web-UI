package co.com.sofka.models.datosRandomModel;

public class DatosModelRandom {


    private String PostId;

    private String FullName;

    //ContacUs
    private String Email;
    private String OrderReference;
    private String Message;

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getOrderReference() {
        return OrderReference;
    }

    public void setOrderReference(String orderReference) {
        OrderReference = orderReference;
    }


//////////////
    public String getPostId() {
        return PostId;
    }

    public void setPostId(String postId) {
        PostId = postId;
    }



    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }


}
