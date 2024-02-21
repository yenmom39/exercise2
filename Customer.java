interface DiscountRate {
    double getServiceMemberDiscount();
    double getProductMemberDiscount();
  }
  
  public class Customer implements DiscountRate {
    private String customerName;
    private String customerType;
  
    public Customer(String customerName, String customerType) {
        this.customerName = customerName;
        this.customerType = customerType;
    }
  
    public String getCustomerName() {
        return customerName;
    }
  
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
  
    public String getCustomerType() {
        return customerType;
    }
  
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
  
    @Override
    public double getServiceMemberDiscount() {
        switch (customerType) {
            case "Premium":
                return 0.20;
            case "Gold":
                return 0.15;
            case "Silver":
                return 0.10;
            default:
                return 0.0;
        }
    }
  
    @Override
    public double getProductMemberDiscount() {
        switch (customerType) {
            case "Premium":
            case "Gold":
            case "Silver":
                return 0.10;
            default:
                return 0.0;
        }
    }
  }
  