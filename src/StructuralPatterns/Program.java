package StructuralPatterns;

//Использован паттерн "Фасад"
public class Program {

    public static void main(String[] args) {

        ServiceFacade service = new ServiceFacade();

        CreditRequest request = service.createRequest("Иванов И.И.", 10000, 100000,  5);
        service.getRequest(request);
        service.updateRequest("Иванов И.И.", 14000, 100000,  5, request);
    }
}
