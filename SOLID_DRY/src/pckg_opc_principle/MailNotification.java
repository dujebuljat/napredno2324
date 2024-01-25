package pckg_opc_principle;

public class MailNotification implements Notification {

    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending notification by mail:\n " + msg);
    }
}
