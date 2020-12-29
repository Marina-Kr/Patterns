package StructuralPatterns;

public class AuditService {
    public void addEntry(CreditRequest creditRequest) {
        System.out.println("Запись о кредитной заявке добавлена в журнал аудита");
    }
}
