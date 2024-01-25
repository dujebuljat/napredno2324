package pckg_opc_principle;

public class SMSNotification implements Notification{

    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending sms:\n" + msg);
    }
}
