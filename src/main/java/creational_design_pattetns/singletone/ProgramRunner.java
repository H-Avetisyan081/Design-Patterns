package creational_design_pattetns.singletone;

public class ProgramRunner {
    public static void main(String[] args) {
      /**  we can see here same object**/
        System.out.println(ProgramLogger.getProgramLogger().toString());
        System.out.println(ProgramLogger.getProgramLogger().toString());
        System.out.println(ProgramLogger.getProgramLogger().toString());
        System.out.println(ProgramLogger.getProgramLogger().toString());


      ProgramLogger.getProgramLogger().addLogInfo("first log");
      ProgramLogger.getProgramLogger().addLogInfo("second log");
      ProgramLogger.getProgramLogger().addLogInfo("third log");
      ProgramLogger.getProgramLogger().addLogInfo("fourth log");

      ProgramLogger.getProgramLogger().showLogFile();
    }
}
