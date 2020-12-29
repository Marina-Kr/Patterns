package BehavioralPatterns.Command;

//Использован паттерн "Команда"
public class Program {
    public static void main(final String[] arguments) {
        Exectutor exectutor = new Exectutor();
        exectutor.execute(Mode.Second);
        exectutor.execute(Mode.First);
    }
}

