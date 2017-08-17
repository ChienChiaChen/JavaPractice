package tw.designpattern.delegate;

public class BusinessDelegate {

    BusinessService businessService;
    BusinessLookUp businessLookUp = new BusinessLookUp();
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTaskService() {
        businessService = businessLookUp.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
