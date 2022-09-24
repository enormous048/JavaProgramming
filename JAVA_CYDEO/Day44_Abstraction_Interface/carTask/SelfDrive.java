package Day44_Abstraction_Interface.carTask;

public interface SelfDrive extends AutoPArk{ //інтерфейси можуть ікстендити інші ітерфейси

    //ікстендим напевно тому шо, не всі аутопарки мають селфдрайвінг - але всі селфдрайвінг мають аутопарк,
    //так шо коли десь імплементиш інтерфейс де є автопілот то не треба автопарк вже імплементувати


    boolean hasAutoPilot = true;

    void selfDrive();
}
