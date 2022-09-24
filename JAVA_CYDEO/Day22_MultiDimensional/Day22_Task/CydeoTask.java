package Day22_MultiDimensional.Day22_Task;

public class CydeoTask {
    public static void main(String[] args) {

        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

        String[][] batch25 = new String[3][];
        batch25[0] = batch25Group1;
        batch25[1] = batch25Group2;
        batch25[2] = batch25Group3;



        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][] batch24 = new String[batch25.length][];
        batch24[0] = batch24Group1;
        batch24[1] = batch24Group2;
        batch24[2] = batch24Group3;

        String[][][] cydeoStudents = new String[2][][];
        cydeoStudents[0] = batch25;
        cydeoStudents[1] = batch24;


        for (String[][] batches : cydeoStudents) { //витягає по одному 2д еррею з 3д
            for (String[] batch : batches) {      //витягає по одному 1д еррею з 2д
                for (String student : batch) {    //витягає по одному елементу з 1д
                    System.out.print( student + "\t");
                }
                System.out.println();
            }
            System.out.println();

        }


    }
}
