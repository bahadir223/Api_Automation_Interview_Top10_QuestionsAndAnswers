public class Details {

    private String companyName;
    private String emailId;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Details(String companyName, String emailId) {
        this.companyName = companyName;
        this.emailId = emailId;
    }
}
