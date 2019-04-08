public class PostGradStudent extends Student{
    public void sendSMS(){
        super.sendSMS();
        System.out.println(this + "PostGradStudent");
    }

    public void sendEmail(){
        System.out.println(this + "PostGradStudent sendEmail");
    }
    
    public void depositAllowance(){
        System.out.println(this + "PostGradStudent depositAllowance");
        allowance += 2 * LIVING_COST;
    }
}