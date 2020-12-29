package StructuralPatterns;

public class ServiceFacade {
    AuditService auditService = new AuditService();
    LogService logService = new LogService();
    MonitoringService monitoringService = new MonitoringService();
    HistoryService historyService = new HistoryService();


    public CreditRequest createRequest(String client, int monthlyPayment, int amount, int percent) {
        CreditRequest newRequest = historyService.createRequest(client, monthlyPayment, amount, percent);
        logService.addEntry(newRequest);
        monitoringService.addEntry(newRequest);
        auditService.addEntry(newRequest);
        return newRequest;
    }

    public void updateRequest(String client, int monthlyPayment, int amount, int percent, CreditRequest request) {
        historyService.updateRequest(client, monthlyPayment, amount, percent, request);
        logService.addEntry(request);
        monitoringService.addEntry(request);
        auditService.addEntry(request);
    }

    public CreditRequest getRequest(CreditRequest request) {
        logService.addEntry(request);
        monitoringService.addEntry(request);
        auditService.addEntry(request);
        return historyService.getRequest(request);
    }
}


